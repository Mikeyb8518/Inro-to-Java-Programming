public class Tax {
    // Data Fields
    private int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;
    // Constructor with default filingStatus, rates, brackets, taxableIncome
    Tax() {
        filingStatus = SINGLE_FILER;

        double[] yearCurrentRates = {10, 15, 25, 28, 33, 35};

        setRates(yearCurrentRates);

        int[][] yearCurrentBrackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},

                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        setBrackets(yearCurrentBrackets);

        taxableIncome = 0;
    }
    // Tax object constructor with specified filingStatus, Rates, Brackets, and taxableIncome
    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        setFilingStatus(filingStatus);
        setBrackets(brackets);
        setRates(rates);
        setTaxableIncome(taxableIncome);
    }

    // Mutator Methods
    // Set a new filing status
    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }
    // Set new brackets
    public void setBrackets(int[][] brackets) {
        this.brackets = new int[brackets.length][brackets[0].length];
        for (int i = 0; i < brackets.length; i++) {
            for (int j = 0; j < brackets[i].length; j++) {
                this.brackets[i][j] = brackets[i][j];
            }
        }
    }
    // Set rates
    public void setRates(double[] rates) {
        this.rates = new double[rates.length];
        for (int i = 0; i < rates.length; i++) {
            this.rates[i] = rates[i] / 100;
        }
    }
    // Set taxableIncome
    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    // Accessor Methods
    // Return filingStatus
    private int getFilingStatus() {
        return filingStatus;
    }
    // Return bracket
    private int[][] getBrackets() {
        return brackets;
    }
    // Return Rates
    private double[] getRates() {
        return rates;
    }
    // Return tax
    public double getTax() {
        double tax = 0, incomeTax = 0;
        double income = taxableIncome;

        if (rates.length >= 2) {
            for (int i = rates.length - 2; i >= 0; i--) {
                if (income > brackets[filingStatus][i]) {
                    tax += (incomeTax = income - brackets[filingStatus][i]) * rates[i];
                    income -= incomeTax;
                }
            }
        }
        return tax += brackets[filingStatus][0] * rates[0];
    }
}
