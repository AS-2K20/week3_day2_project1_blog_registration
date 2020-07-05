package businesslogic;

public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		boolean vp = validPassword(password, confirmPassword);
		boolean va = validEmail(email);
		
		if(vp&&va) {
			return true;
		}
		else {
		return false;
		}
	}
	private boolean validPassword(String password, String confirmPassword) {
		if(password.length()==0) {
			return false;
		}
		if(password!=confirmPassword) {
			return false;
		}
		String p_regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,20}$";
		if(password.matches(p_regex)) {
			return true;
		}
		else
			return false;		
	}
	
	private boolean validEmail(String email) {
		String e_regex = "^[A-Za-z0-9+-_@.]+@(.+)$";
		boolean b = email.matches(e_regex);
		return b;
	}
}
