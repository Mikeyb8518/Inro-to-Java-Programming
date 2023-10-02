import java.util.Scanner;

public class DistinctNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNumber = new int[10];
        int num;
        int count = 0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();

            if (isDistinct(distinctNumber, num)) {
                distinctNumber[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers are: " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctNumber.length; i++) {
            if (distinctNumber[i] > 0) {
                System.out.print(" " + distinctNumber[i]);
            }
        }
        System.out.println();
    }

    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if(num == array[i]) {
                return false;
            }
        }
        return true;
    }
}
