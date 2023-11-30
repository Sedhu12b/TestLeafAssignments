package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod{
	
	public MyLeadsPage(RemoteWebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public CreateLead clickonLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new CreateLead(driver);
	}

}
