public class Employee extends Person {
    // Data fields
    private int office;
    private double salary;
    private MyDate dateHired;



    // Construct employee object
    public Employee(String name, String address, String number, String email,
             int office, double salary) {
        super(name, address, number, email);
        this.office = office;
        this.salary = salary;
        this. dateHired = new MyDate();
    }

    // Return office
    public int getOffice() {
        return office;
    }
    // Return salary
    public String getSalary() {
        return String.format("%.2f", salary);
    }
    // Return dateHired
    public String getDateHired() {
        return dateHired.getMonth() + "/" + dateHired.getDay()
                + "/" + dateHired.getYear();
    }
    // set new office
    public void setOffice(int office) {
        this.office = office;
    }
    // set new salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // set new date
    public void setDateHired() {
        dateHired = new MyDate();
    }
    // Return a String description of the class
    public String toSrting() {
        return super.toString() + "\nOffice: " + office +
                "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }
}
