import java.util.Scanner;

public class LocateLargest {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // Asks user to enter the row and columns for the 2-D array
        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int col = input.nextInt();
        // array variable to hold the 2-D array
        double[][] array = new double[row][col];
        // Asks the user to input the array numbers
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = input.nextDouble();
            }
        }
        // location variable calls the locateLargest method to return the location of the largest number
        int[] location = locateLargest(array);
        // Displays the largest element and its location
        System.out.println("The location of the largest element is (" + location[0] + ", " + location[1] + ")");
    }
    // locateLargest method returns the location of the largest number in the 2-D array
    public static int[] locateLargest(double[][] a) {
        int[] l = new int[2];
        l[0] = 0;
        l[1] = 0;
        double max = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    l[0] = i;
                    l[1] = j;
                    max = a[i][j];
                }
            }
        }
        return l;
    }
}
