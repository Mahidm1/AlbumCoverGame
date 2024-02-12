# AlbumCoverGame

## Overview
AlbumCoverGame is a Java-based game that simulates the process of designing album covers. Players receive feedback on whether musicians are correctly positioned, too far to the left, or too far to the right, and they must adjust the lineup accordingly to win the game.

## Features
- Randomized solution generation for each game instance.
- Interactive guessing of musician positions.
- Feedback system to guide player to the correct lineup.
- Tracking of all draft covers attempted.

## How to Run
Ensure Java is installed and compile the code with:javac AlbumCoverGame.java LineUp.java DraftCover.java LinkedList.java Node.java

Run the game using:java AlbumCoverGame


## Classes and Methods
- `LineUp`: Represents a lineup of musicians with methods to manipulate and retrieve the lineup.
- `DraftCover`: Compares a draft cover suggestion to the solution and provides feedback.
- `AlbumCoverGame`: Main game logic that interacts with the player and processes guesses.
- `LinkedList`: Custom implementation to track and list all attempts made by the player.





