import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUM_OF_QUESTIONS = 15;
        int correctCount = 0;
        int count = 0;
        String output = "";

        while (count < NUM_OF_QUESTIONS) {

            int num1 = (int)(Math.random() * 15);
            int num2 = (int)(Math.random() * 15);

            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            System.out.print("What is " + num1 + " + " + num2 + "?: ");
            int answer = input.nextInt();

            if (num1 + num2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong\n" + num1 + "+" + num2 + " should be " +
                        (num1 + num2));

            }
            count++;

            System.out.println("Correct count is " + correctCount);

            output += "\n" + num1 + " + " + num2 + "=" + answer + ((num1 + num2 == answer) ? " correct": " wrong");
        }
    }
}
