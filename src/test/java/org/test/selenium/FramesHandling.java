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

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		//driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		.............................................HDFC......................................................
//		 WebElement ss = driver.findElement(By.xpath("//title[text()='Welcome to HDFC Bank NetBanking']"));
//		 System.out.println(ss.getText());
//		 
//		 driver.switchTo().defaultContent();
//		 //OuterFrame
//		 WebElement outerframe= driver.findElement(By.xpath("//frameset[@rows='*']"));
//		 
//		 driver.switchTo().frame(outerframe);
//		 // InnerFrame
//		 WebElement innerframe = driver.findElement(By.xpath("//frameset[@rows='*,30']"));
//		 driver.switchTo().frame(innerframe);
		 //LoginFrame
//		// WebElement loginframe = driver.findElement(By.xpath("//frame[@name='login_page']"));
//	    	driver.switchTo().frame("login_page");
//		 
//		 driver.switchTo().defaultContent();
//		 
//	     WebElement ff = driver.findElement(By.xpath("//form[@name='frmLogin']"));
//	     driver.switchTo().frame(ff);
//	     driver.findElement(By.name("fldLoginUserId")).sendKeys("sgsdg");
//	     
//	     
//	     System.out.println(ff.getText());
	    
//			.............................................leaf ......................................................
		
	    driver.switchTo().frame(0);
	    String text = driver.findElement(By.id("Click")).getText();
	    System.out.println(text);
	    driver.findElement(By.id("Click")).click();
	     
	}  
	
	

}
