package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadsTC_003 extends ProjectSpecificMethod{
	
	@Test
	public void runCreateLead() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickonLeads()
		.clickCreateLead()
		.enterCompName()
		.enterFname()
		.enterLName()
		.enterPhoneNumb()
		.clickSubmitButton();
	}

}
