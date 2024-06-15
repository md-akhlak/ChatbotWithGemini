# Personal Chatbot App

This is a personal chatbot application built using Android's Jetpack Compose and Google's Gemini AI model. The app allows users to interact with a chatbot that can generate responses based on the input provided.

## Features

- Real-time chat interface using Jetpack Compose.
- Integration with Google's Gemini AI model for generating responses.
- Simple and clean user interface.

## Screenshots


## Installation

To run this project, follow these steps:

1. **Clone the repository:**

    ```bash
    git clone https://github.com/md-akhlak/ChatbotWithGemini.git
    cd personal-chatbot
    ```

2. **Set up your API Key:**

    - Create a `local.properties` file in the root of your project directory.
    - Add your Gemini API key to this file:

    ```properties
    GENERATIVE_AI_API_KEY=your_api_key_here
    ```

3. **Build and run the project:**

    Open the project in Android Studio, sync the Gradle files, and run the app on your emulator or device.

## Usage

- Launch the app on your Android device or emulator.
- Type a message in the input field and hit send.
- The chatbot will respond with a generated message from the Gemini AI model.

## Project Structure

- `ChatBotViewModel.kt`: Handles the logic for sending and receiving messages using the Gemini AI model.
- `ChatBot.kt`: Composable function that defines the UI of the chatbot screen.
- `components/`: Contains the UI components such as `ChatHeader`, `ChatList`, and `ChatFooter`.

## Dependencies

- Jetpack Compose
- Google Gemini AI

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or new features.


## Acknowledgements

- [Google AI](https://ai.google/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)

## Contact

If you have any questions or feedback, feel free to reach out:

- Email: mohammadakhlak121@gmail.com
- GitHub: [md-akhlak](https://github.com/md-akhlak)
