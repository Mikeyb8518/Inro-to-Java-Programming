public class CommissionSales {
    public static void main(String[] args) {
        System.out.println("\nSales amount\t\t\tCommission");
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.println(salesAmount + "\t\t\t\t\t" + computeCommission(salesAmount));
        }
    }

    public static double computeCommission(double salesAmount) {
        double commission, balance;
        balance = commission = 0.0;

        if (salesAmount >= 10000.01) {
            commission += (balance = salesAmount - 10000) * 0.12;
        }
        if (salesAmount >= 5000.01) {
            commission += (balance -= balance - 5000) * .10;
        }
        if (salesAmount >= 0.01) {
            commission += balance * .08;
        }
        return commission;
    }
}
