package com.GIveIndia.Assessment.Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.GIveIndia.Assessment.Libraries.TakingScreenhshot;
import com.GIveIndia.Assessment.Pages.WikiPage;


public class TC02_ScreenshotOfElementProperties extends BaseClass
{
	@Test
	public void capturingElementProperties() throws Exception
	{
		WikiPage wiki=new WikiPage(driver);
		WebElement element=wiki.getElementProperties();
		
		
		TakingScreenhshot.takeSnapShot(driver, "C:\\NotBackedUp\\Workspace\\GiveIndiaChallenge\\Screenshot", element);
	}
}
