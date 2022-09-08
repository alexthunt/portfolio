package JavaApplication9;

import java.util.ArrayList;
import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char[][] board = {{' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}};
        printBoard(board);
//        board[1][1] = 'X';
//        printBoard(board);
//        board[0][0] = 'O';
//        printBoard(board);

        char currentPlayer = 'X';

        while (!gameOver(board)) {

            int row = -1;
            int column = -1;

            while (invalidRowOrColumn(row, column, board)) {
                System.out.println(currentPlayer + "'s turn!");
                System.out.println("Pick a row to place your piece");
                row = Integer.parseInt(keyboard.nextLine());
                System.out.println("Pick a column to place your piece");
                column = Integer.parseInt(keyboard.nextLine());
            }

            board[row][column] = currentPlayer;

            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }
    }

    private static boolean invalidRowOrColumn(int row, int column, char[][] board) {
        // TODO check if row and column are valid ( 0-2 ), and the location is not empty
        if ((row >= 0 & row <= 2) & (column >= 0 & column <= 2)) {
            if ((board[row][column] == 'x') | (board[row][column] == 'O')) {
                return true;
            }
        }
        return false;
    }

    public static boolean gameOver(char[][] board) {
        return tieGame(board) || playerWins(board);
    }

    public static boolean tieGame(char[][] board) {
        // TODO check if all the spaces are full - or none are empty
        int rowcheck = 0;
        int columncheck = 0;
        boolean keeplooping = true;

        while (keeplooping) {
            if (!(board[rowcheck][columncheck] == 'X') || !(board[rowcheck][columncheck] == 'O')) {
                return false;
            }
            if (rowcheck <= 1) {
                rowcheck++;
            }
            if ((rowcheck == 2) & (columncheck <= 1)) {
                columncheck++;
            } else {
                keeplooping = false;
            }
        }
        return true;

    }

    public static boolean playerWins(char[][] board) {

        return playerWinsVertically(board) || playerWinsHorizontally(board)
                || playerWinsDiagonally(board);
    }

    private static boolean playerWinsVertically(char[][] board) {
        // TODO        
        // check each column, see if all 3 are not empty and match
        if ((board[0][0] == 'X') || (board[0][1] == 'X') || (board[0][2] == 'X')) {
            return true;
        }
        if ((board[0][0] == 'O') || (board[0][1] == 'O') || (board[0][2] == 'O')) {
            return true;
        }
        if ((board[1][0] == 'X') || (board[1][1] == 'X') || (board[1][2] == 'X')) {
            return true;
        }
        if ((board[1][0] == 'O') || (board[1][1] == 'O') || (board[1][2] == 'O')) {
            return true;
        }
        if ((board[2][0] == 'X') || (board[2][1] == 'X') || (board[2][2] == 'X')) {
            return true;
        }
        if ((board[2][0] == 'O') || (board[2][1] == 'O') || (board[2][2] == 'O')) {
            return true;
        }
        return false;
    }

    private static boolean playerWinsHorizontally(char[][] board) {
        // TODO        
        // check each row, see if all 3 are not empty and match
        if ((board[0][0] == 'X') || (board[1][0] == 'X') || (board[2][0] == 'X')) {
            return true;
        }
        if ((board[0][0] == 'O') || (board[1][0] == 'O') || (board[2][0] == 'O')) {
            return true;
        }
        if ((board[0][1] == 'X') || (board[1][1] == 'X') || (board[2][1] == 'X')) {
            return true;
        }
        if ((board[0][1] == 'O') || (board[1][1] == 'O') || (board[2][1] == 'O')) {
            return true;
        }
        if ((board[0][2] == 'X') || (board[1][2] == 'X') || (board[2][2] == 'X')) {
            return true;
        }
        if ((board[0][2] == 'O') || (board[1][2] == 'O') || (board[2][2] == 'O')) {
            return true;
        }
        return false;
    }

    private static boolean playerWinsDiagonally(char[][] board) {
        return playerWinsDiagonallyUp(board) || playerWinsDiagonallyDown(board);
    }

    private static boolean playerWinsDiagonallyUp(char[][] board) {
        // TODO
        // check three locations, if they are not empty and match, someone won
        if ((board[0][2] == 'X') || (board[1][1] == 'X') || (board[2][0] == 'X')) {
            return true;
        }
        if ((board[0][2] == 'O') || (board[1][1] == 'O') || (board[2][0] == 'O')) {
            return true;
        }

        return false;
    }

    private static boolean playerWinsDiagonallyDown(char[][] board) {
        // TODO
        // check three locations, if they are not empty and match, someone won
        if ((board[2][2] == 'X') || (board[1][1] == 'X') || (board[0][0] == 'X')) {
            return true;
        }
        if ((board[2][2] == 'O') || (board[1][1] == 'O') || (board[0][0] == 'O')) {
            return true;
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-----");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-----");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("");
    }

    public static void printBoard(ArrayList<ArrayList<Character>> board) {
        System.out.println(board.get(0).get(0) + "|" + board.get(0).get(1) + "|" + board.get(0).get(2));
        System.out.println("-----");
        System.out.println(board.get(1).get(0) + "|" + board.get(1).get(1) + "|" + board.get(1).get(2));
        System.out.println("-----");
        System.out.println(board.get(2).get(0) + "|" + board.get(2).get(1) + "|" + board.get(2).get(2));
        System.out.println("");
    }

};
