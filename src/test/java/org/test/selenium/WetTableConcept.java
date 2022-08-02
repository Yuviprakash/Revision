package org.test.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WetTableConcept {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/table");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 System.out.println("1..................how many tableTagNme in WebPage");
				 //1..................how many table in WebPage
		List <WebElement> totalTable = driver.findElements(By.tagName("table"));
		 System.out.println(totalTable.size());
		 
		 System.out.println("2..................Print Heading Name in Table");
		 //2...................choose to Table
		 WebElement table = driver.findElement(By.id("simpletable"));
		// Heading Table Th tagname
		 List<WebElement> heading = table.findElements(By.tagName("th"));
		 
		for (int i = 0; i < heading.size(); i++) {
			WebElement ww = heading.get(i);	
			System.out.println(ww.getText());
		}
		System.out.println("3..................Print all row tr value in table ");
		//3..To print  row Text  in table
		 List<WebElement> row = table.findElements(By.cssSelector("tbody tr"));
		 int size = row.size();
		 System.out.println(size);
		 if (size == 3) {
			 System.out.println("pass");
		 }else
		 System.out.println("fail");
		 
		 for (int i = 0; i < row.size(); i++) {
				WebElement ww = row.get(i);	
				System.out.println(ww.getText());
			}
	}	 
}
