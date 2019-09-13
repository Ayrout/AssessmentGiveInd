package com.giveindia.Ayushman.Main;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.giveindia.Libraries.TakingScreenhshot;
import com.giveindia.Pages.WikiPage;

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
