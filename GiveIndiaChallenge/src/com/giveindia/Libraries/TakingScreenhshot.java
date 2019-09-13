package com.giveindia.Libraries;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TakingScreenhshot 
{
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath, WebElement element) throws Exception{

        TakesScreenshot scrShot =(TakesScreenshot)webdriver;

         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
         
         BufferedImage  fullImg = ImageIO.read(SrcFile);

      // Get the location of element on the page
      Point point = element.getLocation();

      // Get width and height of the element
      int eleWidth = element.getSize().getWidth();
      int eleHeight = element.getSize().getHeight();

      // Crop the entire page screenshot to get only element screenshot
      BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
          eleWidth, eleHeight);
      ImageIO.write(eleScreenshot, "png", SrcFile);
  


         File DestFile=new File(fileWithPath);

         FileUtils.copyFile(SrcFile, DestFile);

    }
}
