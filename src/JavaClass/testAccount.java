package JavaClass;

public class testAccount {

	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000);
		account1.setannualInterestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println("The balance is: " + account1.getbalance());
		System.out.println("The monthly interest rate is: " + account1.getMonthlyrate());
		System.out.println("The account was created on: " + account1.getdateCreated());
	}

}
