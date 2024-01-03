public class Execute_11_05 {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming");
        Course course2 = new Course("GED Class");

        course1.addStudent("Michael Boatwright");
        course1.addStudent("Nick Price");
        course1.addStudent("Sam Cota");

        course2.addStudent("Angel Rutherford");
        course2.addStudent("Molly Vogan");

        System.out.println("The number of students in course1: " +
                course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();

        System.out.println("Number of students in course2: " +
                course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (int j = 0; j < course2.getNumberOfStudents(); j++) {
            System.out.print(students2[j] + ", ");
        }
        System.out.println();
    }
}
