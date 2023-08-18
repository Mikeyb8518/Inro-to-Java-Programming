import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        int highestScore = 0;
        String highestScoreName = "";

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("For student " + (i +1) + " Enter Name: ");
            String name = input.next();

            System.out.print("Score: ");
            int score = input.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }
        }

        System.out.println("Student: " + highestScoreName + " has the highest score of " + highestScore);
    }
}
