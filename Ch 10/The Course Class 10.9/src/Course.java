public class Course {
    // Data Fields
    private String courseName;
    private String[] students = new String[1];
    private int numberOfStudents;

    // Default constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }
    // addStudent method
    public void addStudent(String student) {
        // Increase the array size
        if (numberOfStudents == students.length) {
            String[] a = new String[students.length + 1];
            for (int i = 0; i < numberOfStudents; i++) {
                a[i] = students[i];
            }
            students = a;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    // getStudents return students
    public String[] getStudents() {
        return students;
    }
    // getNumOfStudents returns number of students
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    // getCourseName returns course name
    public String getCourseName() {
        return courseName;
    }
    // dropStudent method returns the dropped student
    public void dropStudent(String student) {
        int index = findStudent(student);
        if (index >= 0) {
            dropStudent(index);
        }
        else {
            System.out.println(student + " is not in the course: " + courseName);
        }
    }

    // Deletes a student
    private void dropStudent(int index) {
        String[] s = new String[students.length - 1];
        for (int i = 0, j = 0; i < s.length; i++, j++) {
            if (i == index) {
                j++;
            }
            s[i] = students[j];
        }
        this.students = s;
        numberOfStudents--;
    }
    // Remove all students from course
    public void clear() {
        students = new String[1];
        numberOfStudents = 0;
    }
    // Find students method
    private int findStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)){
                return i;
            }
        }
        return -1;
    }
}
