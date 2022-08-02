package org.test.selenium;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumRevision {
	
	

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//................................//Browzerlaunch
	//	System.setProperty("WebDriver.chrome.driver", "Location")


		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.supermart.ae/");
		driver.get("https://www.swiggy.com/restaurants");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    //GetTitle
		System.out.println(driver.getTitle());
		//GetUrl
		System.out.println(driver.getCurrentUrl());
		
//		WebElement location = driver.findElement(By.xpath("//input[@id='location']"));
//		location.sendKeys("Chennai");
	     Thread.sleep(5000);
//		
//		 //driver.findElement(By.xpath("//span[text()='FIND FOOD']")).click();
//		
	
		// Sign Ip 
	     driver.findElement(By.xpath("//a[@class='r2iyh']")).click();
		driver.findElement(By.name("mobile")).sendKeys("55454545454");
		driver.findElement(By.id("name")).sendKeys("Prakash");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yuviprakash@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hHasdf6dbfjb");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		Assert.assertEquals("account", "account");
		
		
	
		
	}
 
}
