public class Stock {
    String symbol; // string variable symbol
    String name; // string variable name
    double previousClosingPrice; // double variable previousClosingPrice
    double currentPrice; // double variable currentPrice

    // Stock constructor with specified symbol and name
    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }
    // getChangePercentage method that returns percentage change
    double getChangePercentage () {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
