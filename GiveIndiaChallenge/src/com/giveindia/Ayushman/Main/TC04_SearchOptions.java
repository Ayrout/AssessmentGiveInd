package com.giveindia.Ayushman.Main;

import org.testng.annotations.Test;

import com.giveindia.Pages.WikiPage;

public class TC04_SearchOptions extends BaseClass
{
	@Test
	public void searchingForPluto() throws InterruptedException
	{
		WikiPage wiki=new WikiPage(driver);
		wiki.searchForPluto();
	}
}
