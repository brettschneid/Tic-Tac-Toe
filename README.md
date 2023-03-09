# Tic-Tac-Toe
Weclome to my final project for CMSC150; I created a Tic Tac Toe game. 

Run the game file to begain playing against a computer AI

I made this game by creating a board class with an attribute for each "square" of the board, as well as the scanner package and random package. The player goes first by inputting which square they'd like make their move on. Then the computer goes by randomly picking a square. However, it checks beforehand for gaps that can win itself the game, or block the player from winning. 
Before each turn the game checks for a win, loss, or draw. 

# Peer Review Feedback - ALec Nguyen

In the **Game.java** file, it seems like the method *"isGameOver"* is missing. This method should be responsible for checking if the game is over, and if so, returning the winner. If the game is not over yet, it should return null.

Additionally, in the **Board.java** file, there are some redundant parameters in the getter methods. For example, the method *"getTop_Left"* takes a parameter of type Board, but it is not used in the method. It can be removed to simplify the code.

Finally, instead of having separate attributes for each square of the game board, it might be more convenient to represent the board as a 2D array. This would simplify the code and make it easier to perform operations on the board.
