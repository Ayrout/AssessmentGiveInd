package com.GIveIndia.Assessment.Pages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WikiPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='toc']/ul/li[10]/a//span[contains(text(),'External links')]")
	private WebElement externalLinks;
	
	@FindBy(id="External_links")
	private WebElement verifyExternalLink;
	
	@FindBy(xpath="//td[@title='O, Oxygen']/a[@title='Oxygen']/span")
	private WebElement oxygenLinkInPeriodicTable;
	
	@FindBy(xpath="//body[@class='mediawiki ltr sitedir-ltr mw-hide-empty-elt ns-0 ns-subject page-Oxygen rootpage-Oxygen skin-vector action-view']")
	private WebElement featuredImgIcon;
	
	@FindBy(xpath="//table[@class='infobox']")
	private WebElement elementPropertiesTable;
	
	@FindBy(xpath="//input[@id='searchInput']")
	private WebElement searchWiki;
	
	@FindBys({@FindBy(xpath="/html/body/div[7]/div/a")})
	private List<WebElement> searchSuggestions;
	
//	@FindBy(xpath="/html/body/div[7]/div/a[2]")
//	private WebElement plutonium;
	
	
	@FindBy(xpath="//div[@id='toc']/ul/li[9]/a//span[contains(text(),'References')]")
	private WebElement reference;
	
	@FindBys({ @FindBy(xpath="//*[contains(text(),'PDF')]")})
	private List<WebElement> pdfFiles;
	
	
	
	public WikiPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnExternalLinkAndVerify()
	{
		if(externalLinks.isDisplayed())
		{
			externalLinks.click();
		}
		Assert.assertEquals(verifyExternalLink.getText(), "External links");
		
		
		
	}
	
	public void clickOnOxygenLink()
	{
		oxygenLinkInPeriodicTable.click();
	}
	
	public boolean verifyFeaturedArticle()
	{
		return featuredImgIcon.isDisplayed();
		
	}
	
	public WebElement getElementProperties()
	{
		return elementPropertiesTable;
	}
	
	public void clickOnReference()
	{
		reference.click();
	}
	
	public List<WebElement> extractPDFFiles()
	{
		return pdfFiles;
	}
	
	public void searchForPluto(String inputSearch) throws InterruptedException
	{
		
		searchWiki.click();
		searchWiki.sendKeys(inputSearch);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	public void verifyThePositionOfGivenSearchOption(String searchOption)
	{
		int count=0;
		Iterator<WebElement> itr = searchSuggestions.iterator();
		while(itr.hasNext()) 
		{
			count++;
			if(itr.next().getAttribute("title").equalsIgnoreCase(searchOption))
			{
				System.out.println(searchOption+" is present in " +count+" position");
			}
		}
		
		
		
		
		
		
	}

	
	
}
