import java.math.BigDecimal;

public class Divisble2Or3 {
    public static void main(String[] args) {
        // Create string variable num
        String num = "" + 1;

        // for loop to loop through 50 decimal digits
        for (int i = 0; i < 49; i++){
            num += "0";
        }

        // Create new BigDecimal object
        BigDecimal hugeNum = new BigDecimal(num);

        // hugNumCount variable set to 0
        int hugeNumCount = 0;

        // while loop to display results
        while (hugeNumCount < 10) {
            BigDecimal remainder1 = hugeNum.remainder(new BigDecimal(2));
            BigDecimal remainder2 = hugeNum.remainder(new BigDecimal(3));

            if (remainder1.equals(BigDecimal.ZERO) || remainder2.equals(BigDecimal.ONE)) {
                hugeNumCount++;
                System.out.println(hugeNumCount + ": " + hugeNum);
            }
            hugeNum = hugeNum.add(BigDecimal.ONE);
        }
    }
}
