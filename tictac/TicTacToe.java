import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        // UC1: Initialize and display empty board
        char[][] board = new char[3][3];
        initializeBoard(board);
        System.out.println("Game Started - Empty Board:");
        displayBoard(board);

        // UC2: Toss to decide who starts first
        System.out.println("\nPerforming Toss...");
        Random random = new Random();
        int toss = random.nextInt(2);

        String currentPlayer;
        char currentSymbol = 'X';

        if (toss == 0) {
            currentPlayer = "Player 1";
            System.out.println("Toss Result: Player 1 starts first.");
        } else {
            currentPlayer = "Player 2";
            System.out.println("Toss Result: Player 2 starts first.");
        }
        System.out.println(currentPlayer + " is assigned symbol: " + currentSymbol);

        // UC3: Accept User Slot Input (1-9)
        int slot = getPlayerInput(currentPlayer);

        // UC4: Convert Slot Number to Board Index (Row, Column)
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Slot " + slot + " maps to Index: [" + row + "][" + col + "]");
    }

    // UC3: Method to read integer input from user
    public static int getPlayerInput(String player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player + ", enter a slot number (1-9): ");
        return scanner.nextInt();
    }

    // UC1: Helper method to initialize the board
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // UC1: Helper method to display the board
    public static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
