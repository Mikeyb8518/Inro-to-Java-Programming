public class EmployeeHours {
    public static void main(String[] args) {
        // weeklyHours int variable to create the 7-by-7 matrix
        int[][] weeklyHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};
        // totalHours int variable that calls sumRows method and returns the total hours
        int [][] totalHours = sumRows(weeklyHours);
        // sorts the matrix total in decreasing order
        sort(totalHours);
        // prints the final display of each employee and total hours
        print(totalHours);
    }
    // sumRows method returns the sum the total of hours from each row
    public static int[][] sumRows(int[][] m) {
        int[][] total = new int[m.length][2];

        for (int row = 0; row < m.length; row++) {
            total[row][0] = row;
            total[row][1] = 0;
            for (int col = 0; col < m[row].length; col++) {
                total[row][1] += m[row][col];
            }
        }
        return total;
    }
    // sort method sorts in decreasing order of column 1
    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            // Finds the maximum in column 1
            int maxCol1 = m[i][1];
            int maxCol0 = m[i][0];
            int maxIndex = i;

            for (int j = i + 1; j <m.length; j++) {
                if (maxCol1 > m[j][1]) {
                    maxCol1 = m[j][1];
                    maxCol0 = m[j][0];
                    maxIndex = j;
                }
            }
            // Swap
            if (maxIndex != i) {
                m[maxIndex][1] = m[i][1];
                m[maxIndex][0] = m[i][0];
                m[i][1] = maxCol1;
                m[i][0] = maxCol0;
            }
        }
    }
    // print method that displays employee and total hours
    public static void print(int[][] m) {
        System.out.println("Employee     Weekly Hours");
        System.out.println("-------------------------");
        for (int row = 0; row < m.length; row++) {
            System.out.printf("%4d%16d\n", m[row][0], m[row][1]);
        }
    }
}
