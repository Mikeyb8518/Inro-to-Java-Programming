import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] num = new double[10];
        // Asks user to input 10 integer or double values
        System.out.print("Enter 10 integer or double numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();
        }
        // Prints results
        System.out.println("The average integer numbers are: " + average(num));
    }
    // Overloaded method average accepts a integer array and returns its average
    public static double average(int[] array) {
        double average = 0;
        for (int i: array ) {
            average += i;
        }
        return average / array.length;
    }
    // Overloaded method average accepts a double array and returns its average
    public static double average(double[] array) {
        double average = 0;
        for (double i: array) {
            average += i;
        }
        return average / array.length;
    }
}
