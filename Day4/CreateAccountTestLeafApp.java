package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;

public class CreateAccountTestLeafApp {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(35000));
		
		//uname 
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("DemoCSR");		

		//pwd 
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		
		//Login click
		WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();
		
		
		//Click on CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click Account Tab
		driver.findElement(By.partialLinkText("Accounts")).click();
		
		//Click Create Account
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		//Acc Name
		WebElement accName = driver.findElement(By.id("accountName"));
		accName.sendKeys("TLTestName3");
		
		//Acc Desc
		WebElement accDesc = driver.findElement(By.name("description"));
		accDesc.sendKeys("Selenium Automation Tester.");
		
		//Select Industry Type
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select indusDD = new Select(industryDD);
		indusDD.selectByValue("IND_SOFTWARE");
		

		//Select Ownership - Visible Text
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select ownerDD = new Select(ownershipDD);
		ownerDD.selectByVisibleText("S-Corporation");
		
		//Select Source - Select By Value
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select souDD = new Select(sourceDD);
		souDD.selectByValue("LEAD_EMPLOYEE");
		
		//Select marketingCampaignId select BY Index
		WebElement marketingCampaignDD = driver.findElement(By.id("marketingCampaignId"));
		Select marcampDD = new Select(marketingCampaignDD);
		marcampDD.selectByIndex(5);
		

		//Select State - Select by Value
		WebElement stateprovDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select statDD = new Select(stateprovDD);
		statDD.selectByValue("TX");

		
		//Create Account Btn click
		WebElement createbtn = driver.findElement(By.className("smallSubmit"));
		createbtn.click();
		
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Account Name\"]")));
		
		//Verify Acc Name ////table[@class="fourColumnForm"]/tbody/tr/td/span[@class="tabletext"]
		//(//span[text()="Account Name"]/following::td/span)[1]
		WebElement AccnameLbl = driver.findElement(By.xpath("(//span[text()=\"Account Name\"]/following::td/span)[1]"));
		String runtimeAccNam = AccnameLbl.getText();
		
		
		System.out.println("Create Account Name : "+runtimeAccNam);
		
		/*CreateLeadsTestLeafApp createLead = new CreateLeadsTestLeafApp();
		createLead.launchBrowser();
		createLead.launchURL(driver);
		*/		
		
		
	}
	
	ChromeDriver launchBrowser() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
	}
	ChromeDriver launchURL(ChromeDriver driver) {
		driver.get("http://leaftaps.com/opentaps/");
		return driver;		
	}
	void closeBrowser(ChromeDriver driver) {
		driver.close();
		
	}
	
	void createLead(){
		
		
	}
}
