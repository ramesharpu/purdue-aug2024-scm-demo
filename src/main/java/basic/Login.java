package basic;

public class Login {
	
	//from dev-1 + b11 branch
	public void loginWithCredentials(String username, String password) {
		enterUsername(username);
		enterPassword(password);
	}
	
	public void enterUsername(String username) {
		System.out.println("username = " + username);
	}
	
	public void enterPassword(String password) {
		System.out.println("password = " + password);
	}
	
}
