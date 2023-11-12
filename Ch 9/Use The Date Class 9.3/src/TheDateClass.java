import java.util.Date;

public class TheDateClass {
    public static void main(String[] args) {
        // Create a date object
        java.util.Date date = new Date();
        // display date and time for elapsed time
        System.out.println("\nThe dates and times for elapsed times 1000, " +
                "100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000, respectively");
        // for loop to loop thru 1000 to 100000000000
        for (long i = 1000; i <= 1e11; i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}
