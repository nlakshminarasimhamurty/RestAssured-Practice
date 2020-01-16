package project1;

public abstract class Accounts implements IBaseClass {

	private String name;
	private String ssn;
	protected String acctNumber;
	private double balance;
	protected double rate;
	private static int index = 10000;

	public Accounts(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		this.balance = initDeposit;
		this.index++;
		this.acctNumber = setAccountNumber();
		setRate();

	}

	public void deposit(double ammount) {
		balance = balance + ammount;
		System.out.print("your deposited ammont : ");
		printBalance();

	}

	public void withdraw(double ammount) {
		balance = balance - ammount;
		System.out.print("your balance ammont : ");
		printBalance();
	}

	public void transfer(String toWhere, double ammount) {
		balance = balance - ammount;
		System.out.print("transfering $ " + ammount + " to " + toWhere + " And remaining Balance is :");
		printBalance();
	}

	public void printBalance() {
		System.out.println(balance);
	}

	public void compoundInterest() {
		double accuredInterest = balance * (rate / 100);
		balance = balance + accuredInterest;
		System.out.println("Accured Interest : $ " + accuredInterest);
		printBalance();
	}

	public abstract void setRate();

	private String setAccountNumber() {

		String last2DigitSSN = ssn.substring(ssn.length() - 2, ssn.length());
		int fiveDigitUniqueNumber = index;
		int random3Nmuber = (int) (Math.random() * Math.pow(10, 3));
		return last2DigitSSN + fiveDigitUniqueNumber + random3Nmuber;
	}

	public void showInfo() {
		System.out.println(" Name : " + name + "\n account Number : " + acctNumber + "\n Balance : " + balance
				+ "\n Rate : " + rate + "%");
	}

}
