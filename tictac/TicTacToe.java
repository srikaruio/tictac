import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        // UC1: Initialize and display empty board
        char[][] board = new char[3][3];
        initializeBoard(board);
        System.out.println("Game Started - Empty Board:");
        displayBoard(board);

        // UC2: Toss to decide who starts first and assign symbols
        System.out.println("\nPerforming Toss...");
        Random random = new Random();
        int toss = random.nextInt(2); // 0 for Player 1, 1 for Player 2

        String firstPlayer;
        char firstPlayerSymbol = 'X';

        if (toss == 0) {
            firstPlayer = "Player 1";
            System.out.println("Toss Result: Player 1 starts first.");
        } else {
            firstPlayer = "Player 2";
            System.out.println("Toss Result: Player 2 starts first.");
        }

        // Storing game state variables
        String currentPlayer = firstPlayer;
        char currentSymbol = firstPlayerSymbol;

        System.out.println(currentPlayer + " is assigned symbol: " + currentSymbol);
    }

    // Helper method to initialize the board
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Helper method to display the board
    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
