
public class GradeExam {
    public static void main(String[] args) {
        // Students answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the question
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] correctCount = new int[answers.length][2];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount[i][0] = i;
                    correctCount[i][1]++;
                }
            }
        }
        // Calls sort method to sort column in increasing order
        sort(correctCount);
        // Displays the students correctCount in increasing order
        for (int row = 0; row < correctCount.length; row++) {
            System.out.println("Student " + correctCount[row][0] + "'s correct count is " +
                    correctCount[row][1]);
        }
    }
    // sort method sorts by column 1 in accending order
    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            // Finds the min in column 1
            int minCol1 = m[i][1];
            int minCol0 = m[i][0];
            int minIndex = i;

            for (int j = i + 1; j <m.length; j++) {
                if (minCol1 > m[j][1]) {
                    minCol1 = m[j][1];
                    minCol0 = m[j][0];
                    minIndex = j;
                }
            }
            // Swap
            if (minIndex != i) {
                m[minIndex][1] = m[i][1];
                m[minIndex][0] = m[i][0];
                m[i][1] = minCol1;
                m[i][0] = minCol0;
            }
        }
    }
}
