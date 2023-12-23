public class Faculty extends Employee {
    // Data fields
    private String officeHours;
    private String rank;

    // Constructors
    /*Faculty object with specified name, address, number, email, office,
    * salary, office hours, rank */
    public Faculty(String name, String address, String number, String email, int office,
            double salary, String officeHours, String rank) {
        super(name, address, number, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Return officeHours
    public String getOfficeHours() {
        return officeHours;
    }

    // Return rank
    public String getRank() {
        return rank;
    }

    // Set new officeHours
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    // Set new rank
    public void setRank(String rank) {
        this.rank = rank;
    }

    // Return a string description of the class
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours +
                "\nRank: " + rank;
    }
}
