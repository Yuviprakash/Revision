package org.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExcetorConcpet {
	public static void main(String[] args) throws Exception {
		
	
	/// browzer launch setup;;;; 	
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	// driver.get("https://www.facebook.com/");
	 driver.get("https://www.w3schools.com/");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 // driver.finelemenyBy.xpath()
	// WebElement element = driver.findElement(By.id("email"));
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 //senkey in Textbox--Set in textbox.
//	 
//	 
//	 // thre way to give the value in text box...
//	// element.sendKeys("yuviprakasj")// webdriver
//	//1... js.executeScript("arguments[0].value='yuviprakash'", element);
//	js.executeScript("arguments[0].setAttribute('value','greenstech')", element);
//	//js.executeScript("alert('enter correct login credentials to continue');");
//	Thread.sleep(5000);
//	 //// get value in text box
//	   
//	    Object username = js.executeScript("return arguments[0].getAttribute('value')",element);
//		System.out.println(username);
//		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;');", element);
//		Thread.sleep(2000);
////		js.executeScript("arguments[0].setAttribute('style','background:red');", element);
////		Thread.sleep(2000);
//		js.executeScript("arguments[0].style.background='yellow'", element);
//		Thread.sleep(5000);
		
//		/// Perform clik operation....
//		WebElement ff = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		js.executeScript("arguments[0].click()", ff);
//		Thread.sleep(4000);
//		driver.quit();
	 
	 // SCROOL UP  AND SCROOL DoWN
	 WebElement scrdown = driver.findElement(By.xpath("(//a[text()='FORUM'])[1]"));
	 Thread.sleep(3000);
	 js.executeScript("arguments[0].scrollIntoView(true)", scrdown);
	  
	 WebElement scrup = driver.findElement(By.xpath("(//a[@title='Video Tutorials'])[1]"));
	 Thread.sleep(3000);
	 js.executeScript("arguments[0].scrollIntoView(false)",scrup);
		
	}
}
