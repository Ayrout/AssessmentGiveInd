package com.giveindia.Ayushman.Main;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.giveindia.Pages.WikiPage;

public class TC03_CountNumberOfPDFLinksInReference extends BaseClass
{
	@Test
	public void getTheNumberOfPDFLinksInReference()
	{
		WikiPage wiki=new WikiPage(driver);
		wiki.clickOnReference();
		
		List<WebElement> li= wiki.extractPDFFiles();
		int countOfPDFFiles=li.size();
		System.out.println("The count of PDF files in Reference: "+countOfPDFFiles);
	}
}
