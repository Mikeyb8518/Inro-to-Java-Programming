import java.text.DecimalFormat;

public class FutureTuition {
    public static void main(String[] args) {
         DecimalFormat df = new DecimalFormat("0.00");

         double totalcost = 0;
         double tuition = 10000;
         double tuition10year = 0;

         for (int year = 1; year <= 14; year++) {
             tuition += (tuition * 0.05);

             if (year > 10)
                 totalcost += tuition;

             if (year == 10)
                 tuition10year = tuition;
         }

         System.out.println("Tuition in ten years: $" + df.format(tuition10year));

         System.out.println("Total cost for four years worth of tuition after the 10th year is: $" +
                 df.format(totalcost));
    }
}
