import java.util.Scanner;

public class ASIIcode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code: ");

        int userInput = input.nextInt();

        char output = (char) userInput;

        System.out.println("The ASCII character for " + userInput + " is " + output);
    }
}
