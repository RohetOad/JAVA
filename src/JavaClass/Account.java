/*
 
Project: The Account Class
Problem Description:
(The Account class) Design a class named Account that
contains:
 A private int data field named id for the account
(default 0).
 A private double data field named balance for the
account (default 0).
 A private double data field named annualInterestRate
that stores the current interest rate (default 0).
Assume all accounts have the same interest rate.
 A private Date data field named dateCreated that
stores the date when the account was created.
 A no-arg constructor that creates a default account.
 A constructor that creates an account with the
specified id and initial balance.
 The accessor and mutator methods for id, balance, and
annualInterestRate.
 The accessor method for dateCreated.
 A method named getMonthlyInterestRate() that returns
the monthly interest rate.
 A method named withdraw that withdraws a specified
amount from the account.
 A method named deposit that deposits a specified
amount to the account.
Draw the UML diagram for the class. Implement the
class. Write a test program that creates an Account
object with an account ID of 1122, a balance of
$20,000, and an annual interest rate of 4.5%. Use
the withdraw method to withdraw $2,500, use the
deposit method to deposit $3,000, and print the
balance, the monthly interest, and the date when
this account was created.

Please check the testAccount.java for test program.
 */

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
