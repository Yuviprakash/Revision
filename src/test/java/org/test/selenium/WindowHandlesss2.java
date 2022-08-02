package org.test.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesss2 {

	public static void main(String[] args) throws InterruptedException {
		
	 	
		 WebDriverManager.chromedriver().setup();		
	     WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		 String parentWindow = driver.getWindowHandle();
		 System.out.println(parentWindow);
		 
		 WebElement ff = driver.findElement(By.id("newWindowsBtn"));	 
		 ff.click();

		 Set<String> allid = driver.getWindowHandles();
		 System.out.println(allid);
		 
		 for ( String x : allid) {
		 System.out.println(x);
		 }
		 
		  List<String> handle = new ArrayList<String>();
		   handle.addAll(allid);
		  //switch the new windoow
		  String newwindow = handle.get(1);
		   driver.switchTo().window(newwindow);
		   System.out.println(driver.getTitle());
		   driver.findElement(By.name("name")).sendKeys("Ramesh");
		   driver.switchTo().window(handle.get(1));
		   // 
		   System.out.println(driver.getTitle());
		   Thread.sleep(3000);
		   driver.switchTo().window(parentWindow);
		   System.out.println(driver.getTitle());
		   driver.findElement(By.id("newWindowBtn")).click();
		   
		  //driver.findElement(By.xpath("(//input[@class='bcTextBox'])[1]")).sendKeys("prakash");
		  // driver.findElement(By.xpath("(//input[@class='bcTextBox'])[2]")).sendKeys("ramesh");
		   Thread.sleep(3000);
		  
		  driver.quit();
		  
		 
		 
	}

}
