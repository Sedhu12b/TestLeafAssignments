package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create New Acc
		WebElement createNewAcc = driver.findElement(By.partialLinkText("Create new account"));
		createNewAcc.click();
		
		//Enter FirstName
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Guzhalineyaa");	
		
		//Enter SurName
		WebElement sname = driver.findElement(By.name("lastname"));
		sname.sendKeys("Sedhu");
		
		//mail
		WebElement mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys("Laddu@gmlii.com");
		
		//Password
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("1234567");
		
		//DOB
		//Date birthday_day select
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select dateDD = new Select(date);
		dateDD.selectByVisibleText("7");
		//Month
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select monthDD = new Select(month);
		monthDD.selectByVisibleText("Jan");
		//Year

		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select YearDD = new Select(Year);
		YearDD.selectByVisibleText("2017");
		
		driver.findElement(By.xpath("//label[text()=\"Male\"]")).click();
		
	}
	
}
