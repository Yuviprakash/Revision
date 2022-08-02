package org.test.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {
     
	
	public static void captureScreenshot( WebDriver driver, String filename) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver; 
		 File sourse = ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(sourse, new File("C:/Users/user/eclipse-workspace/Revision/src/test/resources/" + filename));
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.in/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();	
		 //
		 captureScreenshot(driver, "beforegoogle.png");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//input[@name='btnI'])[2]")).click();
		 Thread.sleep(4000);
		 captureScreenshot(driver, "aftergoogle.png");
		 driver.quit();
		 
//		 TakesScreenshot ts =  (TakesScreenshot)driver;
//		 File sourse = ts.getScreenshotAs(OutputType.FILE);
//		 FileUtils.copyFile(sourse, new File("C:/Users/user/eclipse-workspace/Revision/src/test/resources/image.png"));
//		 
		 
		 
		 
		 
	}
	
}
		
		
	
