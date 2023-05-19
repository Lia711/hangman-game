# hangman-game

Features:
- Traditional game of hangman made in Java

Includes: 
- Three difficulty levels: Easy mode gives 8 lives to the player; normal mode gives 5 and hard mode gives 3
- Tracking of remaining lives and letters already guessed
- Uncovering the hidden word as more correct words are guessed
- If a played inputs more than one letter, only the first character (or its lowercase equivalent) will be considered. Numbers will be incorrect
- Visual prepresentation of the hangman using ASCII characters
- Option to play again and guess a different random word

Files- 5 Java classes:
- "Main" contains the main logic of the game for a playthrough
- "Word" deals with generating a random word to guess includes array of 10 different animals but user can add/remove any words they want to guess
- "Interaction" deals with the player-console interaction and the letters and numbers they input, controlling the flow of the game
- "Guesses" contains logic for whenever the player guessses a letter
- "Graphics" contains the drawings of the hangman for each amount of lives left

Known Issues (Work In Progress) 
- No error handling for when user inputs a letter instead of a number when prompted with a choice
