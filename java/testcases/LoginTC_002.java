package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTC_002 extends ProjectSpecificMethod {
	@Test
	public void runLogOut() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickLogoutButton();
		
	}

}
