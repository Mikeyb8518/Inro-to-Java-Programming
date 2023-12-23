public class Person {
    // Data Fields
    private String name;
    private String address;
    private String number;
    private String email;

    // Person constructor with default inputs
    public Person() {
        this("unknown", "unknown", "unknown", "unknown");
    }
    // Person constructor with specified inputs
    public Person(String name, String address, String number, String email) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    // return name
    public String getName() {
        return name;
    }
    // Return email
    public String getAddress() {
        return address;
    }
    // Return number
    public String getNumber() {
        return number;
    }
    // Return email
    public String getEmail() {
        return email;
    }
    // Set a new name
    public void setName(String name) {
        this.name = name;
    }
    // Set new address
    public void  setAddress(String address) {
        this.address = address;
    }
    // Set new number
    public void setNumber(String number) {
        this.number = number;
    }
    // Set a new email
    public void setEmail(String email) {
        this.email = email;
    }
    // Return a String description of the class
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address +
                "\nPhone number: " + number + "\nEmail address: " + email;
    }
}
