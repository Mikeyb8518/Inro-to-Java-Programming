import java.util.Scanner;

public class RandomNumberChooser {
    public static void main(String[] args) {
        final int SIZE = 10;
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[SIZE];
        // Asks user to input 10 numbers to exclude from random number picked
        System.out.print("Enter 10 numbers to exclude from random numbers 1-100: ");
        // For loop to allow the user to enter numbers into the numbers array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        // Prints out random number except the ones the user entered
        System.out.println("Numbers generated is: " + getRandom(numbers));
    }
    // getRandom method that generates a number between 1-100
    public static int getRandom(int... numbers) {
        int random = (int)(Math.random() * 100 + 1);

        for (int i = 0; i < numbers.length; i++) {
            if (random == numbers[i]) {
                random = (int)(Math.random() * 100 + 1);
                i = -1;
            }
        }
        return random;
    }
}
