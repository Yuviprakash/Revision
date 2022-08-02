package org.test.selenium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
	
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
//	 driver.get("https://www.google.in/");
//	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	 driver.manage().window().maximize();
//	 driver.findElement(By.name("q")).sendKeys("Hyr tutorials");
//	 driver.findElement(By.name("btnK")).submit();
//	 // Navigation Class
//	 driver.navigate().to("https://www.facebook.com/");
//	 //driver.findElement(By.name("firstname")).sendKeys("Prakash");
//	 // refresh page
//	 Thread.sleep(4000);
//	 driver.navigate().refresh();
//	 Thread.sleep(4000);
//	 // back page
//	 driver.navigate().back();
//	 Thread.sleep(3000);
//	// Forward Page
//	 driver.navigate().forward();
//	 Thread.sleep(3000);
//	 driver.quit();
	 
	 URL url = new URL("https://www.google.in/");
	 driver.navigate().to(url);
	}
	
	

	

}
