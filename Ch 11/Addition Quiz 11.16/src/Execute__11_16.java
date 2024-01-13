import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Execute__11_16 {
    // Main Method
    public static void main(String[] args) {
        // Create two number variables to generate
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // Create ArrayList answers
        ArrayList<Integer> answers = new ArrayList<>();

        System.out.print("What is " + num1 + " + " + num2 + "?: ");
        int answer = input.nextInt();

        while (num1 + num2 != answer) {
            if (answers.contains(answer)) {
                System.out.println("You already answered " + answer);
            } else {
                System.out.println("Wrong answer. Try again, what is " + num1 +
                        " + " + num2 + "?: ");
                answers.add(answer);
            }
            answer = input.nextInt();
        }

        System.out.println("You got it!!");
    }
}
