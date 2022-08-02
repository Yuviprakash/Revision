package org.test.cssselectorr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSimpleSelector {

	public static void main(String[] args) {
		 
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 //1
		System.out.println( driver.findElement(By.cssSelector("button")).getAttribute("id"));
		//2
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Prakash");
		//3
		driver.findElement(By.cssSelector(".gender")).sendKeys("Male");
		//4
		System.out.println( driver.findElement(By.cssSelector("*")).getSize());
		
				
		 
		 
	}

}
