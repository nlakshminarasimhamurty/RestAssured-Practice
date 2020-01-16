package project1;

public class Checking extends Accounts {

	private int debitCardNumber;
	private int debitCardPIN;

	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		acctNumber = "2" + acctNumber;
		setDebitCard();
	}

	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		System.out.println(" Account Type : Checking ");
		super.showInfo();
		System.out.println(" card detials:debitCardNumber = " + debitCardNumber);
		System.out.println(" card detials:debitCardPIN = " + debitCardPIN);

	}

	@Override
	public void setRate() {

		rate = getBaseRate() + .15;
	}

}
