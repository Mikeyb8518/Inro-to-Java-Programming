import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        System.out.print("Enter Scores(Enter negative number to end): ");

        int[] scores = new int[100];

        score(scores);
    }

    public static void score(int[] scores) {
        Scanner input = new Scanner(System.in);

        int num;
        int average;
        int numOfScores;
        numOfScores = average = 0;

        for (int i = 0; i < 100; i++) {
            num = input.nextInt();

            if (num < 0)
                break;

            scores[i] = num;
            average += num;
            numOfScores++;
        }

        average /= numOfScores;

        int aboveOrEqual;
        int below;
        aboveOrEqual = below = 0;

        for (int i = 0; i < numOfScores; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            }
            else {
                below++;
            }
        }
        System.out.println("\nAverage number of scores is: " + average);
        System.out.println("\nScores above or equal to average: " + aboveOrEqual);
        System.out.println("\nScores below average: " + below);
    }
}
