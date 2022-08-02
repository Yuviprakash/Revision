package org.test.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorPractice {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> ff = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> gg = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(int i = 0; ff.size()>i;i++)
		{
			for(int j= 0; gg.size()>j; j++) {
				WebElement e = gg.get(j);
		
				System.out.println(e.getText() );
			}
		WebElement w = ff.get(i);
		
		System.out.println(w.getText());
		}

	}
	

}
