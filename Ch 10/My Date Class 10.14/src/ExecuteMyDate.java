public class ExecuteMyDate {
    public static void main(String[] args) {
        // Create two myDate objects
        myDate date1 = new myDate();
        myDate date2 = new myDate(34355555133101L);

        // Display results
        System.out.println("Date1: " + date1.getMonth() + "/" + date1.getDay() + "/" + date1.getYear());

        System.out.println("Date2: " + date2.getMonth() + "/" + date2.getDay() + "/" + date2.getYear());
    }
}
