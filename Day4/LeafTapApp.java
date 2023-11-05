package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Browser	
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		String url = "http://leaftaps.com/opentaps/";
		driver.get(url);
		
		//Maximize Window
		driver.manage().window().maximize();
		

		//Implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//uname 
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("DemoCSR");		

		//pwd 
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		

		//Login Btn
		WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();		

        // Link CRM/SFA
		WebElement linkcrmSFA = driver.findElement(By.partialLinkText("CRM/SFA"));
		linkcrmSFA.click();
		
		//wait
		Thread.sleep(2000);
		
		//Link Leads
		WebElement linkLeads = driver.findElement(By.partialLinkText("Leads"));
		linkLeads.click();
		

		//Link Leads
		WebElement linkCrLeads = driver.findElement(By.partialLinkText("Create Lead"));
		linkCrLeads.click();
		
		//LeadsFname
		WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.sendKeys("FName1");
				

		//LeadsFname
		WebElement comName = driver.findElement(By.id("createLeadForm_companyName"));
		comName.sendKeys("TestLeaf1");
		

		//LeadsFname
		WebElement lName = driver.findElement(By.id("createLeadForm_lastName"));
		lName.sendKeys("TestLeaf1");
		
		//SourceDD - createLeadForm_dataSourceId
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourDD = new Select(sourceDD);
		sourDD.selectByIndex(0);
		
		//wait 
		Thread.sleep(2000);
		
		//SourceDD select by VisibleText
		sourDD.selectByVisibleText("Conference");
		
		//wait 
		Thread.sleep(2000);
		
		//SourceDD select by value
		sourDD.selectByValue("LEAD_EMPLOYEE");
		
		
		
		//MarketDD - createLeadForm_marketingCampaignId
		WebElement MarketDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingcampDD = new Select(MarketDD);
		marketingcampDD.selectByIndex(0);
		
		//wait 
		Thread.sleep(3000);
		marketingcampDD.selectByVisibleText("Automobile");
		
		
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDDlist = new Select(ownershipDD);
		ownershipDDlist.selectByValue("OWN_SCORP");
		
		//Click on Create Lead Btn
		WebElement createLeadbtn = driver.findElement(By.className("smallSubmit"));
		createLeadbtn.click();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			
		
		//Verify Title
		String createLeadtitle = driver.getTitle();
		System.out.println(createLeadtitle);
		if (createLeadtitle.contains("View Lead")) {
			System.out.println("Create Succfull - Pass");
		}
		
		
	}

}
