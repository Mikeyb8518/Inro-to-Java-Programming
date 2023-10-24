import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        // Create board
        String[][] board = getBoard();
        // Create two player tokens
        String[] tokens = {" X ", " O "};
        // Game result status
        int result;

        do {
            // Displays board
            print(board);
            // cell marks board
            int[] cell = getCell(board, tokens[0]);
            // Places token on board
            placeToken(board, cell, tokens[0]);
            // Determines game status
            result = gameStatus(board, tokens[0]);
            // If statement to make next player take turn
            if (result == 2) {
                swap(tokens);
            }
        }
        while (result == 2);
        // Display board
        print(board);
        // Display game result
        if (result == 0) {
            System.out.println(tokens[0] + "player won");
        }
        else {
            System.out.println("Players draw");
        }
    }
    // gameStatus method determines weather the game is a win, draw, or loss
    public static int gameStatus(String[][] m, String e) {
        if (isWin(m, e)) {
            return 0;
        } else if (isDraw(m)) {
            return 1;
        }else {
            return 2;
        }
    }
    // isWin method returns true if tokens are in a horizontal, vertical, diagonal
    public static boolean isWin(String[][] m, String t) {
        return isHorizontalWin(m, t) || isVerticalWin(m, t) || isDiagonalWin(m, t);
    }
    // isHorizontal method returns true if 3 tokens are in a horizontal row
    public static boolean isHorizontalWin(String[][] m, String t) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j =  0; j < m[i]. length; j++) {
                if (m[i][j] == t) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
    // isVertical method returns true if 3 tokens are in a vertical row
    public static boolean isVerticalWin(String[][] m, String t) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][i] == t) {
                    count++;
                }
            }
            if (count  == 3) {
                return true;
            }
        }

        return false;
    }
    // isDiagonal method returns true if 3 tokens are in a diagonal row
    public static boolean isDiagonalWin(String[][] m, String t) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i][i] == t) {
                count++;
            }
            if (count == 3) {
                return true;
            }
        }

        count = 0;
        for (int i = 0, j = m[i].length - 1; j >= 0; j--, i++) {
            if (m[i][j] == t) {
                count++;
            }
            if (count == 3) {
                return true;
            }
        }

        return false;
    }
    // isDraw method returns true if all cells on board are filled with tokens and neither player has won
    public static boolean isDraw(String[][] m) {
        for ( int i = 0 ; i < m. length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == "   ") {
                    return false;
                }
            }
        }
        return true;
    }
    // swap method swaps the elements in an array
    public static void swap(String[] p) {
        String temp = p[0];
        p[0] = p[1];
        p[1] = temp;
    }
    // placeToken method fills the matrix cell with players tokens
    public static void placeToken(String[][] m, int[] e, String t) {
        m[e[0]][e[1]] = t;
    }
    // getCell method returns a valid cell input by user
    public static int[] getCell(String[][] m, String t) {
        // create scanner
        Scanner input = new Scanner(System.in);
        int[] cell = new int[2]; // Cell row and column
        // prompt player to enter a token
        do {
            System.out.print("Enter a row(0, 1, or 2) for player " + t + ": ");
            cell[0] = input.nextInt();
            System.out.print("Enter a column(0, 1, or 2) for player " + t + ": ");
            cell[1] = input.nextInt();
        } while (!isValidCell(m, cell));

        return cell;
    }
    // isValidCell method returns if cell is empty and in the 3-by-3 matrix
    public static boolean isValidCell(String[][] m, int[] cell) {
        for (int i = 0; i < cell.length; i++) {
            if (cell[i] < 0 || cell[i] >= 3) {
                System.out.println("Invalid cell");
                return false;
            }
        }
        if (m[cell[0]][cell[1]] != "   ") {
            System.out.println("\nRow " + cell[0] + " column " + cell[1] + " is filled");
            return false;
        }

        return true;
    }
    // getBoard returns a 3-by-3 array filled with blank spaces
    public static String[][] getBoard() {
        String[][] m = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = "   ";
            }
        }
        return m;
    }
    // print method displays the board
    public static void print(String[][] m) {
        System.out.println("\n-------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("|" + m[i][j]);
            }
            System.out.println("|\n-------------");
        }
    }
}
