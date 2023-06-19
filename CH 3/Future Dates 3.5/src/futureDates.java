import java.util.Scanner;

public class futureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day: ");
        int day =  input.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int daysPassed = input.nextInt();

        int futureDay = (day + daysPassed) % 7;

        String todayDayString = findDate(day);
        String futureDayString = findDate(futureDay);

        System.out.println("Today is " + todayDayString + " and the future day is " + futureDayString);
    }

    public static String findDate(int date) {
        String dayString;

        switch (date) {
            case 0:
                dayString = "Sunday";
                System.out.println("Today is ");
                break;
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            default:
                dayString = "Invalid Day";
        }
        return dayString;
    }
}
