package week5.day4;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class w3SchollswithXL {
	RemoteWebDriver driver; 
//	String fname,cc,expMon,cv,expYr;
	
	@Test
	public void launchbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
	}
	
	//
	@Test(dataProvider="fetch")
	public void paymentdetails
	(String fname, String cc, String expMon, String cv, String expYr,
			String crname, String email, String addr, 
			String city,String zip, String state) {
		//Switch to Frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(fname);
		driver.findElement(By.id("ccnum")).sendKeys(cc);
		driver.findElement(By.id("expmonth")).sendKeys(expMon);
		driver.findElement(By.id("cvv")).sendKeys(cv);
		driver.findElement(By.id("expyear")).sendKeys(expYr);
		
		// BIlling Address Details
		driver.findElement(By.id("fname")).sendKeys(crname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("adr")).sendKeys(addr);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("zip")).sendKeys(zip);
		driver.findElement(By.id("state")).sendKeys(state);
		System.out.println("Code End");
		
	}
	
	
	@DataProvider(name="fetch")
	public String[][] w3XLTestD() throws IOException {
		
		XSSFWorkbook xlbook = new XSSFWorkbook("./data/W3XLTestData.xlsx");
		XSSFSheet xlSht = xlbook.getSheet("Sheet1");
		int rc = xlSht.getLastRowNum();
		System.out.println("Row Count : "+rc);
		System.out.println("Fist val : "+xlSht.getRow(0).getCell(0).getStringCellValue());
		
		int colcnt = xlSht.getRow(rc).getLastCellNum();
		System.out.println("Col count : "+colcnt);
		System.out.println("Last Cell Valu :"+xlSht.getRow(0).getCell(colcnt-1).getStringCellValue());
		
		//Declare Array to Store the values in Array
		String[][] testData = new String[rc][colcnt];
		
		//Row  loop
		for (int i = 1; i <= rc; i++) {
			
			//Column Loop
			for (int j = 0; j < colcnt; j++) {
				
				String stringCellValue = xlSht.getRow(i).getCell(j).getStringCellValue();
				testData[i-1][j] = stringCellValue;
			}
			
		}
		
		return testData;
		
		
	}
	
}
