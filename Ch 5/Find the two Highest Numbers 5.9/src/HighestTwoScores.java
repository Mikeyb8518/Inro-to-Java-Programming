import java.util.Scanner;

public class HighestTwoScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudent = input.nextInt();

        String high1 = "";
        String high2 = "";

        int highScore1 = 0;
        int highScore2 = 0;

        for (int i = 0; i < numStudent; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = input.next();

            System.out.print("Score: ");
            int score = input.nextInt();

            if (score > highScore1) {
                high2 = high1;
                highScore2 = highScore1;
                high1 = name;
                highScore1 = score;
            } else if (score > highScore2) {
                high2 = name;
                highScore2 = score;
            }
        }
        System.out.println("The highest 2 scores are " + high1 + " with a score of " + highScore1 +
                " and " + high2 +" with a score of " + highScore2);
    }
}
