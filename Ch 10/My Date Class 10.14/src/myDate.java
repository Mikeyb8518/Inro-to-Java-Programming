import java.util.GregorianCalendar;

public class myDate {
    private int year;
    private int month;
    private int day;

    // Create a MyDate object with current date
    myDate() {
        GregorianCalendar calander = new GregorianCalendar();
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }
    // Create myDate object with specified date January 1, 1970
    myDate(long elapsedTime) {
        setDate(elapsedTime);
    }
    // myDate constructor that creates an object with specified year, month, day
    myDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    // return year
    public int getYear() {
        return year;
    }
    // return month
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }
    // return day
    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }
    // sets a new date for the object using elapsedTime
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
