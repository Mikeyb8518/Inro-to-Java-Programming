import java.util.Scanner;

public class CountExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, pNum = 0, nNum = 0;
        int count = 0;
        double total = 0, average;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        num = input.nextInt();

        if (num == 0) {
            System.out.println("No number are entered except 0");
            System.exit(1);
        }

        while (num != 0) {
            if (num > 0) {
                pNum++;
            } else {
                nNum++;
            }
            total += num;
            count++;
            num = input.nextInt();
        }

        average = total / count;

        System.out.println("The number of positives is: " + pNum +
                "\nThe number of negatives is: " + nNum +
                "\nThe total is: " + total +
                "\nThe average is: " + average);
    }
}
