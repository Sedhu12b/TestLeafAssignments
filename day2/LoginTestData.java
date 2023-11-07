package week3.day2;

public class LoginTestData extends TestData{

	public void enterUsername() {
		System.out.println("LoginTestData - enterUsername");

	}
	public void enterPassword() {
		System.out.println("LoginTestData - enterPassword");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData LTD = new LoginTestData();
		LTD.enterCredentials();
		LTD.navigateToHomePage();
		LTD.enterUsername();
		LTD.enterPassword();
		
		

	}

}
