public class NumberOfOnes {
    public static void main(String[] args) {
        // Create 6-by-6 matrix
        int[][] matrix = new int[6][6];
        // Displays matrix filled with 0s and 1s
        for (int i = 0; i < matrix.length; i++) {
            for (int j =  0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Displays result of row by calling isAllRowsEven1s method to test matrix
        System.out.println("Every row " + (isAllRowsEven1s(matrix) ? "has" : "does not have " +
                "even number of1s"));
        // Displays results of column by calling isAllColumnsEven1s method to test matrix
        System.out.println("Every column " + (isAllColumnsEven1s(matrix) ? "has" : "does not have" +
                " even number of1s"));
    }
    /* isAllRowsEven1s method tests if all rows have even amount of 1s
    * returns false if not even or returns true if even amount of ones */
    public static boolean isAllRowsEven1s(int[][] m) {
        int count = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    /* isAllColumnsEven1s method tests if all columns have even amount of 1s
     * returns false if not even or returns true if even amount of ones */
    public static boolean isAllColumnsEven1s(int[][] m) {
        int count = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
