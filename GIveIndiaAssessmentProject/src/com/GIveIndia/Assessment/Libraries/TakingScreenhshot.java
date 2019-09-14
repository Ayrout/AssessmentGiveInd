package com.GIveIndia.Assessment.Libraries;

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


     // Take screen shot of whole web page
        File screenShot = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
 
        // Calculate the width and height of the drop down element
        Point p = element.getLocation();
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();
 
        // Create Rectangle of same width as of drop down Web Element
        Rectangle rect = new Rectangle(width, height, height, height);
 
        BufferedImage img = null;
        img = ImageIO.read(screenShot);
 
        //Crop Image of drop down web element from the screen shot
        BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width, rect.height);
 
        // write cropped image into File Object
        ImageIO.write(dest, "png", screenShot);
 
        //Copy Image into particular directory
        FileUtils.copyFile(screenShot,
                new File("D:/Recordings/WebElementScreenShot.png"));
    }

    }

