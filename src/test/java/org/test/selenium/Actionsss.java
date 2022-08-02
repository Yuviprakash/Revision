package org.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsss {
	
	 public static void main(String[] args) throws InterruptedException {
		 
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
//		 
//		 driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
	      Actions a = new Actions(driver);
//		 //click
//	     // double click();
//	     Thread.sleep(5000);
//	     WebElement d = driver.findElement(By.xpath("//input[@id='continue']"));
//	     a.doubleClick(d);
		 WebElement ww = driver.findElement(By.xpath("//span[text()='Prime']"));
		 a.moveToElement(ww).perform();
		 a.contextClick().perform();
	
	
	
 
 }
}
