package org.test.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("name")).sendKeys("Ramesh");
		
//		// No of Frames in Webpage>>>>>>>>>>>>>>>GENERAL FRAMES
//	     List<WebElement> ff = driver.findElements(By.tagName("iframe"));
//	     System.out.println(ff.size());
//	     
//	     WebElement framee = driver.findElement(By.id("frm1"));
//	     driver.switchTo().frame(framee);
//	     Thread.sleep(5000);
//	     
//	  // click in Select class
//	     Select ss = new Select(driver.findElement(By.id("course")));
//	     ss.selectByVisibleText("Java");
//	     Thread.sleep(5000);
//	     driver.switchTo().defaultContent();
//	     Thread.sleep(5000);
//	     driver.findElement(By.id("name")).sendKeys("Prakash");
//	     
	     // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Nested Frames
		
		 driver.findElement(By.id("name")).sendKeys("Ramesh");  // Main WebPage
		 driver.switchTo().defaultContent();
	     WebElement framee = driver.findElement(By.id("frm2"));
	     // 3rd  frame
	     driver.switchTo().frame(framee);
	     
	     JavascriptExecutor js =  (JavascriptExecutor) driver;
	     WebElement d = driver.findElement(By.id("firstName"));
	     d.sendKeys("sfsf");
	     Thread.sleep(5000);
	     js.executeScript("arguments[0].scrollIntoView(true)", d);
	     Thread.sleep(5000);
	     
	     driver.switchTo().defaultContent();
	     Thread.sleep(5000);
	     driver.findElement(By.id("name")).clear();
	     driver.findElement(By.id("name")).sendKeys("Prakash");
	     Thread.sleep(5000);
	     driver.quit();
	     
	     
	     
	     
	}

}
