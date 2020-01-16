package project1;

public class Savings extends Accounts {

	private int saftyDepositBoxId;
	private int saftyDepositBoxKey;

	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		acctNumber = "1" + acctNumber;
		setSaftyDeposit();
	}

	private void setSaftyDeposit() {
		saftyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		saftyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));

	}

	public void showInfo() {
		System.out.println(" Account Type : Savings ");
		super.showInfo();

		System.out.println(" Safty account features : " + "\n saftyDepositBoxId : " + saftyDepositBoxId
				+ "\n saftyDepositBoxKey : " + saftyDepositBoxKey);

	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;

	}
}
