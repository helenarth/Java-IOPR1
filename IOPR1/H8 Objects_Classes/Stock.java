public class Stock {
	String symbol1;
	String name;
	double previousClosingPrice;
	double currentprice;

	public Stock(String symbol, String name) {

		this.symbol1 = symbol;
		this.name = name;

	}

	public double previousClosingPrice() {

		return previousClosingPrice;

	}

	public double currentprice() {

		return currentprice;

	}

	public void currentprice(double current) {

		currentprice = current;

	}

	public void previousClosingPrice(double previous) {

		previousClosingPrice = previous;

	}

	public String getSymbol() {
		return symbol1;
	}

	public String getName() {
		return name;
	}

	public double getChangPercent() {

		return (currentprice - previousClosingPrice) / previousClosingPrice;

	}

	public void setSymbol(String symbol) {
		this.symbol1 = symbol;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Stock stock = new Stock("SUNW", "Sun MicroSystems Inc.");
		stock.previousClosingPrice(100);

		// Set current price
		stock.currentprice(1500);

		// Display stock info
		System.out.println("Previous Closing Price: "
				+ stock.previousClosingPrice());
		System.out.println("Current Price: " + stock.currentprice());
		System.out.println("Price Change: " + stock.getChangPercent());
	}

}
