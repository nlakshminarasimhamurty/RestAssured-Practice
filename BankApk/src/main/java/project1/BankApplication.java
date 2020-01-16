package project1;

import java.util.LinkedList;
import java.util.List;

public class BankApplication {
	public static String file = "C:\\Users\\nlakshminarasimhamur\\Desktop\\AccountInfo.csv";

	public static void main(String[] args) {

		/*
		 * Savings saving = new Savings("Naveen", "123456789", 2000); Checking check =
		 * new Checking("Pavan", "098765432", 2500); saving.showInfo();
		 * saving.compoundInterest(); System.out.println("***********************");
		 * check.showInfo(); check.compoundInterest();
		 */
		List<Accounts> accounts = new LinkedList<Accounts>();

		List<String[]> dataReader = utilities.CsvReader.dataReader(file);

		for (String[] dataline : dataReader) {
			String name = dataline[0];
			String ssn = dataline[1];
			String AccountType = dataline[2];
			double initDeposit = Double.parseDouble(dataline[3]);

			if (AccountType.equalsIgnoreCase("Savings")) {
				accounts.add(new Savings(name, ssn, initDeposit));

			} else if (AccountType.equalsIgnoreCase("Checking")) {
				accounts.add(new Checking(name, ssn, initDeposit));
			} else {
				System.out.println("ERROR IN ACCOUNT TYPE : "+ AccountType);
			}

		}

		for (Accounts act : accounts) {
			if (act instanceof Savings) {
				System.out.println("Saving bank account Details");
				act.showInfo();
				System.out.println("###################");
			} else if (act instanceof Checking) {
				System.out.println("Checking bank account Details");
				act.showInfo();
				System.out.println("###################");

			} else {
				System.out.println("Invalid Account Type");
			}
		}
	}

}
