package com.example.personalchatbot

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import com.example.personalchatbot.components.ChatFooter
import com.example.personalchatbot.components.ChatHeader
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.personalchatbot.components.ChatList


@Composable
fun ChatBot(viewModel: ChatBotViewModel = viewModel()) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        ChatHeader()

        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Center
        ) {
            if (viewModel.list.isEmpty()) {
                Text(text = "No Chats Available")
            } else
                ChatList(list = viewModel.list)
        }

        ChatFooter {
            if (it.isNotEmpty()) {
                viewModel.sendMessage(it)
            }
        }
    }
}
