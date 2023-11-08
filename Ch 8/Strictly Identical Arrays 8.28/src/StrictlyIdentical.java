import java.util.Scanner;

public class StrictlyIdentical {
    public static void main(String[] args) {
        // print statements calling getArray method to get user input arrays
        System.out.print("Enter list1: ");
        int[][] list1 = getArray();

        System.out.print("Enter list2: ");
        int[][] list2 = getArray();
        // prints out the result calling equals method to see if the arrays are identical
        System.out.println("The two arrays" + (equals(list1, list2) ? " " : " not ") + "strictly identical");
    }
    // equals method returns false if m1 is not equal to m2 and true if they match
    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    // getArray method returns a 3-by-3 matrix of user input and returns m
    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }
}
