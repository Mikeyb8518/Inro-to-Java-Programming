import java.util.Scanner;

public class keyPad {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");

        String userInput = input.nextLine().trim();

        userInput = userInput.toLowerCase();

        int num = 0;

        if ("abc".contains(userInput)) {
            num += 2;
        } else if ("def".contains(userInput)) {
            num += 3;
        } else if ("ghi".contains(userInput)) {
            num += 4;
        } else if ("jkl".contains(userInput)) {
            num += 5;
        } else if ("mno".contains(userInput)) {
            num += 6;
        } else if ("pqrs".contains(userInput)) {
            num += 7;
        } else if ("tuv".contains(userInput)) {
            num += 8;
        } else if ("wxyz".contains(userInput)) {
            num += 9;
        } else {
            System.out.println(userInput + " is an invalid input");
        }

        System.out.println("The corresponding number is " + num);
    }
}
