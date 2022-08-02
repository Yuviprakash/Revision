package org.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
     	driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		// switch concept // alert accert
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(4000);
        //alert dismiss`	
        
		driver.switchTo().alert().dismiss();
		// alert sendkeys and alert OKK
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(4000);
        alert.sendKeys("prakash");
        Thread.sleep(4000);
        alert.accept();
		driver.quit();
		
		
		
		
		
		
		
	}

}
