public class BMI {
    // Public and Private data fields
    private String name;
    private int age;
    private double height;
    private double weight;

    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public static final double INCH_PER_FOOT = 12;

    // Default constructor
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Constructor for name, weight, height with age of 20 specified
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }
    // BMI constructor for name, age, weight, feet, inches
    public BMI(String name, int age, double weight, double feet, double inches) {
        this(name, age, weight, inches + feet * 12);
    }
    // getBMI method to calculate BMI
    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }
    // accessor methods
    // getStatus returns the statues of the BMI result
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
    // getName returns name
    public String getName() {
        return name;
    }
    // getAge returns age
    public int getAge() {
        return age;
    }
    // getHeight returns height
    public double getHeight() {
        return height;
    }
    // getWeight returns weight
    public double getWeight() {
        return weight;
    }
}
