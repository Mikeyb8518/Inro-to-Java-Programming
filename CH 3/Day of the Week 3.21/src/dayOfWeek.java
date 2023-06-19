import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        System.out.println("Enter Month: 1-12: ");
        int temp = input.nextInt();

        int m;
        if (temp == 1) {
            m = 13;
            year -= 1;
        } else if (temp == 2) {
            m = 14;
            year -= 1;
        } else {
            m = temp;
        }
        int century = year % 100;
        int j = year / 100;

        System.out.println("Enter the day of the month: 1-31: ");
        int day = input.nextInt();

        int h = (day + (26 * (m + 1) / 10) + century + century / 4 + j / 4 + 5 * j) % 7;

        String dayOfTheWeek = "";

        switch (h) {
            case 0:
                dayOfTheWeek += "Saturday";
                break;
            case 1:
                dayOfTheWeek += "Sunday";
                break;
            case 2:
                dayOfTheWeek += "Monday";
                break;
            case 3:
                dayOfTheWeek +=  "Tuesday";
                break;
            case 4:
                dayOfTheWeek += "Wednesday";
                break;
            case 5:
                dayOfTheWeek += "Thursday";
                break;
            case 6:
                dayOfTheWeek += "Friday";
                break;

        }
            System.out.println("Day of the week is " + dayOfTheWeek);
    }
}
