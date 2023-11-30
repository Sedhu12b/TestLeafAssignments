package pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;



public class CreateLead extends ProjectSpecificMethod {

	
	public CreateLead(RemoteWebDriver driver) {
		this.driver = driver;
	}

	

//	@Test
//	public void createLeads() {
		
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		driver.findElement(By.linkText("Leads")).click();
		
		public CreateLead clickCreateLead() {
			driver.findElement(By.linkText("Create Lead")).click();
			return this;		
		}
		
		public CreateLead enterCompName() {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			return this;
		}
		public CreateLead enterFname() {	
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
			return this;
		}
		
		public CreateLead enterLName() {			
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
			return this;
		}
		
		public CreateLead enterPhoneNumb() {
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
			 return this;
		}
		public CreateLead clickSubmitButton() {
			driver.findElement(By.name("submitButton")).click();
			return this;
		}
}







