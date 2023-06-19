import java.util.Scanner;

public class additionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int num3 = (int) (Math.random() * 10);

        System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ");

        int answer = input.nextInt();

        if (num1 + num2 + num3 == answer) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("You entered the incorrect answer.");
            System.out.println("The answer is " + (num1 + num2 + num3));
        }
    }
}
