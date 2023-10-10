import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask user to input the number of students
        System.out.println("Please enter the number of students: ");

        // Arrays to hold students names and scores
        String[] students = new String[input.nextInt()];
        int[] scores = new int[students.length];

        // Ask the user to input the student name and score
        System.out.println("Please enter the name and score for students: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = input.next();
            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }
        // Calls method to sort in decreasing order of students and scores
        sortDecreasing(students, scores);
        // Prints out the students name and score in decreasing order
        for (int i = 0; i < scores.length; i++) {
            System.out.println(students[i] + " score is: " + scores[i]);
        }
    }
    // sortDecreasing method that sorts string and scores in decreasing order
    public static void sortDecreasing(String[] strs, int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int max = nums[i];
            int maxindex = i;
            String temp;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxindex = j;
                }
            }

            if (maxindex != i) {
                // Swap string array
                temp = strs[i];
                strs[i] = strs[maxindex];
                strs[maxindex] = temp;
                // Swap int array
                nums[maxindex] = nums[i];
                nums[i] = max;
            }
        }
    }
}
