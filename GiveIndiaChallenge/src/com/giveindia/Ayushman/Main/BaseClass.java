package com.giveindia.Ayushman.Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;




public class BaseClass 
{
	WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\NotBackedUp\\Workspace\\GiveIndiaChallenge\\src\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Selenium");
		
		
		
		
		
	}
	
//	@AfterTest
//	public void tearDown()
//	{
//		driver.close();
//		driver.quit();
//	}
}
