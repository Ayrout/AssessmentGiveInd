package com.GIveIndia.Assessment.Test;


import org.testng.annotations.Test;

import com.GIveIndia.Assessment.Pages.WikiPage;


public class TC04_SearchOptions extends BaseClass
{
	@Test
	public void searchingForPlutoAndVerifyPositionOfPlutonium() throws InterruptedException
	{
		WikiPage wiki=new WikiPage(driver);
		wiki.searchForPluto("Pluto");
		
		wiki.verifyThePositionOfGivenSearchOption("Plutonium");
		
		}
		
		
	}

