import java.util.Scanner;

public class coinFlip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt to ask the user to enter a guess of either 0 or 1
        System.out.print("Guess the flip of the coin(0-Heads or 1-Tails): ");

        // Guess variable to hold users guess
        int guess = input.nextInt();

        // String variable named coin
        String coin;
        // Int variable named flip using Math.random to generate flip between 0 and 1
        int flip = (int) (Math.random() * 2);

        // If-else statement to check if flip is equal to users guess, or tell user guess was incorrect
        if (flip == guess) {
            // Nested if-else statement to let user know guess was correct and what side it landed on
            if (flip == 0) {
                coin = "Heads";
                System.out.println("Congrats you guessed correct the coin landed on " + coin);
            }
            else {
                coin = "Tails";
                System.out.println("Congrats you guessed correct the coin landed on " + coin);
            }
        }
        else {
            System.out.println("Sorry your guess was incorrect, Please try again");
            System.exit(1);
        }
    }
}
