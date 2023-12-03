package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTC_003 extends ProjectSpecificMethod{
	
	@Test(dataProvider="readXLSheet")
	public void runCreateLead(String comName,String fName, String lName,String phNumb) {
		LoginPage lp = new LoginPage(driver) ;
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickCreateLead()
		.enterCompanyName(comName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterPhno(phNumb)
		.clickSubmitButton();	
		
	}
	
	@BeforeTest
	public void setData() {
		TestDataFileName = "CreateLead";
	}

}
