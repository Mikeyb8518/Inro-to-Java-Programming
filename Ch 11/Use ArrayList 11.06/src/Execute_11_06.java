import java.util.ArrayList;
import java.util.Date;

public class Execute_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> o = new ArrayList<Object>();

        o.add(new Loan());
        o.add(new Date());
        o.add(new String("String Class"));
        o.add(new Circle());

        // Display all elements in the list by
        // invoking the objects toString() method
        for (int i = 0; i < o.size(); i++) {
            System.out.println((o.get(i)).toString());
        }
    }
}
