public class ExecuteTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time time1 = new Time();
        Time time2 = new Time(555550000);

        // Display Time object hour, minute, and
        // second in the format hour:minute:second
        System.out.println(time1.getHour() + ":" + time1.getMinute() +
                ":" + time1. getSecond());
        System.out.println(time2.getHour() + ":" + time2.getMinute() +
                ":" + time2. getSecond());
    }
}
