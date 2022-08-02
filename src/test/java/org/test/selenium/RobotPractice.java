package org.test.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotPractice {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//// Robot Classs
	
		
		 Robot r = new Robot();
		 WebElement ff = driver.findElement(By.xpath("//input[@id='email']"));
		 ff.sendKeys("yuviprakash@gmail.com");
		 r.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(5000);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB); 
		
		 
		 driver.findElement(By.id("pass")).sendKeys("94865331548");
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB); 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 
		 
	
	
	}

}
