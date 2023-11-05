package week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
				
		//Load URL
		String url = "https://www.facebook.com/";
		driver.get(url);
				
		//Maximize Window
		driver.manage().window().maximize();
		
		
		//wait
		Thread.sleep (3000);
		
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys(" Tuna@321");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		Thread.sleep(3000);
		
		String FBHometitle = driver.getTitle();
		
		if(FBHometitle.contains("Forgotten")) {
			System.out.println(FBHometitle);
			
		}


	}

}
