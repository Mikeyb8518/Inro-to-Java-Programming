import java.util.Scanner;

public class ShuffleRows {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // initialize matrix
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        // call shuffle method to shuffle matrix
        shuffle(matrix);
        // Display the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
    // shuffle method shuffles the matrix in a 2D int array
    public static void shuffle(int[][] m) {
        int[] temp = new int[2];

        for (int i = 0; i < m.length; i++) {
            int i1 = (int)(Math.random() * m.length);

            temp[0] = m[i][0];
            temp[1] = m[i][1];
            m[i][0] = m[i1][0];
            m[i][1] = m[i1][1];
            m[i1][0] = temp[0];
            m[i1][1] = temp[1];
        }
    }
}
