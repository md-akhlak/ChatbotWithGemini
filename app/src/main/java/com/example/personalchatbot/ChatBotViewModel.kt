package com.example.personalchatbot

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.launch

class ChatBotViewModel : ViewModel() {

    val list by lazy {
        mutableStateListOf<ChatData>()
    }

    private val genAI by lazy {
        GenerativeModel(
            modelName = "gemini-pro",
            apiKey = ApiKey

        )
    }

    fun sendMessage(message: String) = viewModelScope.launch {

        val chat = genAI.startChat()
        list.add(ChatData(message, ChatRoleEnum.USER.role))

        val response = genAI.startChat().sendMessage(prompt = message).text

        chat.sendMessage(
            content(ChatRoleEnum.USER.role) { text(message) }
        ).text?.let {
            list.add(ChatData(it, ChatRoleEnum.MODEL.role))
        }

    }
}