package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTC_001 extends ProjectSpecificMethod {

	@Test
	public void runLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink();
	}
	
}
