import javax.xml.crypto.Data;

public class Account {

	private int id;
	private double balance;
	private double annualInteresRate;
	private Data datacreated;

	public Account(int id, double balance) {

		this.balance = balance;

		this.id = id;

	}

	public Data getDatacreated() {
		return datacreated;
	}

	public void setDatacreated(Data datacreated) {
		this.datacreated = datacreated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAnnualInteresRate() {
		return annualInteresRate;
	}

	public void setAnnualInteresRate(double annualInteresRate) {
		this.annualInteresRate = annualInteresRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double newbalance) {
		this.balance = newbalance;
	}

	public int accessor() {
		return id;

	}

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);

	}

}
