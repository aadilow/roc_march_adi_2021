package regexs;

public class Regex {

	public static void main(String[] args) {
		// passport = 9 numeric digits
		// ssn = 9 numeric digits
		// dl = 8 numeric

		String[] passport = { "123456789", "test", "dog" };
		String[] ssn = { "987654321", "123456789", "dog" };
		String[] dl = { "12341234", "cat", "cat" };

		for (int i = 0; i < passport.length; i++) {
			
			System.out.println("Test Case: " + (i+1));
			
			if (passport[i].matches("[0-9]{9}")) {
				System.out.println(passport[i] + " is a valid Passport #");
			} else
				System.out.println("ERROR: " +passport[i] + " is an invalid Passport #");

			if (ssn[i].matches("[0-9]{9}")) {
				System.out.println(ssn[i] + " is a valid SSN #");
			} else
				System.out.println("ERROR: " +ssn[i] + " is an invalid SSN #");

			if (dl[i].matches("[0-9]{8}")) {
				System.out.println(dl[i] + " is a valid DL #");
			} else
				System.out.println("ERROR: " +dl[i] + " is an invalid DL #");
			
			System.out.println();
		}

	}

}
