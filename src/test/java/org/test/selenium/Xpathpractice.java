package org.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathpractice {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		 System.out.println(driver.getPageSource());
		 driver.quit();
		 
//		 // contains with Text
//		 WebElement ff = driver.findElement(By.xpath("//a[contains(text(),'Sign in into ')]"));
//		 System.out.println(ff.getText());
//		 // Contains with Attribute Value
//		 String text2 = driver.findElement(By.xpath("//div[contains(@class,'sign')]")).getText();
//		 System.out.println(text2);
//		 // Start with method() using.,,,,,,,,,,,,
//		 String text = driver.findElement(By.xpath("//a[starts-with(text(),'Sign in in')]")).getText();
//		 System.out.println(text);
//		 //Normalize-space() Using.,.,,.
//		 String s =driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")).getText();
//		 System.out.println(s);
//		 
		 
//		 // Axes method
//		 // 1. following-sibling method
//		 driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]"));
//		 //2.Parent axes method
//		 driver.findElement(By.xpath("//label[text()='Email']/parent::div"));
//		 //3.Child axes metthod
//		 driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text']"));
//		 //4. preceding-sibling method	 
//		 driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input"));	 
//		 //5.descendent
//		 driver.findElement(By.xpath("//div[@class='container']/descendant::button[1]"));
//		 
//		 //6.ancestor
//		 driver.findElement(By.xpath("//div[@class='container']/ancestor::div"));
//		 //7. me/ parent / grandparenot
//		 driver.findElement(By.xpath("//div[@class='container']/ancestor-or-self::div"));
//		 //Followingm method
//		 driver.findElement(By.xpath("//label[text()='Password']/following::input[1]"));
//		 //
		 
		 
		 
		 
	}

}
