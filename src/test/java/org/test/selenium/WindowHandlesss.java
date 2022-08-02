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

public class WindowHandlesss {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 //1 step
		 driver.get("https:www.snapdeal.com");
		 //2 getWindowhandle>>>>>>> PARENT WINDOW
		 String oneid = driver.getWindowHandle();
		 // 
		 WebElement ww = driver.findElement(By.name("keyword"));
		 ww.sendKeys("hand sanitizer");
		 driver.findElement(By.className("searchTextSpan")).click();
		 // 3rd click on open new window
		 driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();
		 Thread.sleep(3000);
		 //4th getall window ID
		 Set<String> allid = driver.getWindowHandles();
		 System.out.println(allid);
		 //5th  set is converted as List
		 List<String> li = new ArrayList<String>();
		 
		 //6th 
		 li.addAll(allid);
		 
		 //7swithch  the window
		 driver.switchTo().window(li.get(1));
		 // add to card
		 driver.findElement(By.xpath("(//span[@class='intialtext'])[1]")).click();
		 
		 
		 
 	      
		 
		 
		 
		
		 
		 
		
		
//		 
//		 WebElement ff = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
//		 ff.click();
//		 
//		 String oneid = driver.getWindowHandle();
//		 System.out.println(oneid);
//		 
//		 Set<String> allid = driver.getWindowHandles();
//		 System.out.println(allid);
//		 
//		 // Set is coverted as list 
//		List<String> li = new ArrayList<String>();
//		li.addAll(allid);
//		
//		/// swith the ParentWindow
//		driver.switchTo().window(oneid);
//		System.out.println(driver.getTitle());
//		// swith the Child Window
//		driver.switchTo().window(li.get(1));
//		System.out.println(driver.getTitle());
//		
//		driver.close();
		
	 
	}

}
