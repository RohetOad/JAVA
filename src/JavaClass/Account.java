package JavaClass;


public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	Account(){	
	};
	
	Account(int new_id, double new_balance){
		id = new_id;
		balance = new_balance;
		annualInterestRate = 7.0;
		dateCreated = new java.util.Date();
	};
	
	public int getID() {
		return id;
	};
	
	public double getbalance() {
		return balance;
	};
	
	public double getannualInterestRate() {
		return annualInterestRate;
	};
	
	public void setID(int new_id) {
		id = new_id;	
	};
	
	public void setbalance(double new_balance) {
		balance = new_balance;
	};
	
	public void setannualInterestRate(double new_rate) {
		annualInterestRate = new_rate;
	};
	
	public String getdateCreated() {
		return dateCreated.toString();
	};
	
	public double getMonthlyrate() {
		return annualInterestRate/12;
	};
	
	public void withdraw(double w) {
		balance = balance - w;
	};
	
	public void deposit(double d) {
		balance = balance + d;
	};
}
