public class Execute {
    public static void main(String[] args) {
        // creates a stock object with newSymbol and newName
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        // stock object previousClosingPrice set to 34.5
        stock.previousClosingPrice = 34.5;
        // stock object currentPrice set to 34.35
        stock.currentPrice = 34.35;
        // Displays stock name, stock symbol, Price percent change
        System.out.println("\nStock name: " + stock.name);
        System.out.println("Stock symbol: " + stock.symbol);
        System.out.printf("Price-change percentage: %.2f%%\n",
                stock.getChangePercentage());
    }
}
