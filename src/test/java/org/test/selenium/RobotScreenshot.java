package org.test.selenium;

import java.awt.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotScreenshot {
     
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		 WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.in/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();	
		 //
		Robot r = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage source = r.createScreenCapture(rectangle);
		File destination = new File("C:/Users/user/eclipse-workspace/Revision/src/test/resources/Screenshot/robotScreenshot.png" );
		ImageIO.write(source, "png", destination);
		
		
		
	}
	
}
		
		
	
