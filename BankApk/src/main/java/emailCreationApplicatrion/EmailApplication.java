package emailCreationApplicatrion;

public class EmailApplication {

	public static void main(String[] args) {

		Sales sales = new Sales("naveen", "kumar", "devolo", "livevox");
		System.out.println(sales.getEmailAddress());
		System.out.println(sales.getMaiiBoxCapcity());

	}

}
