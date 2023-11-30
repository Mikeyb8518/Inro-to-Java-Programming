public class ExecuteBMI {
    public static void main(String[] args) {
        // Calls BMI class with set name, age, weight, feet, inches
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 5, 10);
        // Displays results
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi1.getBMI() + " " + bmi1.getStatus());
        // Calls BMI class with name, weight, height
        BMI bmi2 = new BMI("Susan King", 215, 70);
        // Displays results
        System.out.println("The BMI for " + bmi2.getName() + " is "
                + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
