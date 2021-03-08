package exceptions;

public class Validator {
	public boolean validPassport(String passport) throws BusinessExceptionChecked {
			
		if(passport.matches("[0-9]{9}")==false) {
			throw new BusinessExceptionChecked("Invalid Passport: " +passport);
		}
	
		return true;
	}
	
	public boolean validDL(String DL) {
		
		if(DL.matches("[0-9]{9}")==false) {
			throw new BusinessExceptionUnchecked("Invald DL: " +DL);
		}
		return true;
	}
}
