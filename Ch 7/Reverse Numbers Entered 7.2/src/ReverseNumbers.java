import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {

        int[] array = new int[10];

        System.out.print("Enter ten integers: ");

        fill(array);

        System.out.print("The reverse is: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void fill(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }
}
