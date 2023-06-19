import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter month in 1-12: ");
        int month = input.nextInt();

        System.out.print("Please enter year: ");
        int year = input.nextInt();

        String printMonth;
        int day;
        int leapYear = (year % 4);

        if (leapYear == 0 && month == 2) {
            printMonth = "February";
            day = 29;
            System.out.println("The month " + month + " has " + day + " days" + " in the year" + year +
                    " is a leap year");
        } else if (month == 1) {
            printMonth = "January";
            day = 31;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 3) {
            printMonth = "March";
            day = 31;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 4) {
            printMonth = "April";
            day = 30;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 5) {
            printMonth = "May";
            day = 31;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 6) {
            printMonth = "June";
            day = 30;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 7) {
            printMonth = "July";
            day = 31;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 8) {
            printMonth = "August";
            day = 31;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 9) {
            printMonth = "September";
            day = 30;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 10) {
            printMonth = "October";
            day = 31;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 11) {
            printMonth = "November";
            day = 30;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 12) {
            printMonth = "December";
            day = 31;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else if (month == 2) {
            printMonth = "February";
            day = 28;
            System.out.println("The month " + printMonth + " has " + day + " days" + " in the year " + year);
        } else {
            System.out.println("You have entered an invalid number value for month");
            System.exit(1);
        }
    }
}
