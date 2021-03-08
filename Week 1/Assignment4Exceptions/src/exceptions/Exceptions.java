package exceptions;

public class Exceptions {

	public static void main(String[] args) {
		Validator v = new Validator();

		String passport[] = { ":)","dog", "123456789", "123456789000" }; // 9 digit numeric
		int k = passport.length;
		for (int i = 0; i < k; i++) {

			try {
				if (v.validPassport(passport[i])) {
					System.out.println("Passport is valid");
				}
			} catch (BusinessExceptionChecked e) {
				System.out.println(e.getMessage());
			}
		} // end of passport

		String DL[] = { "987654321", "pizza", "900800700600","/';!@#$" };
		k = DL.length;
		for (int i = 0; i < k; i++) {
			try {
				if (v.validDL(DL[i])) {
					System.out.println("Valid DL: " +DL[i]);
				}
			} catch (BusinessExceptionUnchecked e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
