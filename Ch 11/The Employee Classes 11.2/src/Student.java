public class Student extends Person {
    // data fields
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static  int JUNIOR = 3;
    public final static  int Senior = 4;

    // Create a constructor with specified inputs from student
    public Student(String name, String address, String number, String email, int status) {
        super(name, address, number, email);
        this.status = status;
    }
    // Set status
    public void setStatus(int status) {
        this.status = status;
    }
    // Get status
    public String getStatus() {
        return switch (status) {
            case 1 -> "freshman";
            case 2 -> "sophomore";
            case 3 -> "junior";
            case 4 -> "senior";
            default -> "unknown";
        };
    }
    public String toString() {
        return super.toString() + "\nstatus: " + getStatus();
    }
}
