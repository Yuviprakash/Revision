package org.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderConcept {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.id("datepicker")).click();
		 ///click august 31// 
		 
		 WebElement cc = driver.findElement(By.xpath("//a[@title='Next']"));
		 cc.click();
		 driver.findElement(By.xpath("//a[text()='31']")).click();
		 
		 

	}

}
