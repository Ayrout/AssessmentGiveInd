package com.GIveIndia.Assessment.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.GIveIndia.Assessment.Pages.WikiPage;



public class TC01_ExternalLinkAndOxygenLink extends BaseClass
{
	WikiPage wiki;
	@Test
	public void verifyAndClickOnExternalLink()
	{
		wiki=new WikiPage(driver);
		wiki.clickOnExternalLinkAndVerify();
	}
	
	@Test(dependsOnMethods={"verifyAndClickOnExternalLink"})
	public void clickOnOxygenTable()
	{
		wiki.clickOnOxygenLink();
		String oxygentitle=driver.getTitle();
		Assert.assertEquals(oxygentitle, "Oxygen - Wikipedia");
		
		//Validating that Oxygen page is a features arcticle or not
		boolean verifyFeaturedValue=wiki.verifyFeaturedArticle();
		if(verifyFeaturedValue)
		{
			System.out.println(oxygentitle+" is a featured article");
		}
		else
		{
			System.out.println(oxygentitle+" is not a featured article");
		}
	}
}
