package org.test.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WetTableConcept2 {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://leafground.com/pages/table.html");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 System.out.println("1..................Get the count of number of columns");
				 //1...................Get the count of number of rows
		 List <WebElement> head = driver.findElements(By.tagName("th"));
	     int size = head.size();
	     System.out.println("head size" + size);
		 
		 System.out.println("2..................Get the count of number of rows");
		 //2....................Get the count of number of rows
		 List <WebElement> rows = driver.findElements(By.tagName("tr"));
		int trsize = rows.size();
		 System.out.println("row size" + trsize);
		 
		 // ............................Get the progress value of 'Learn to interact with Elements'
		 System.out.println("2..................Get the progress value of 'Learn to interact with Elements");
		 List <WebElement> ss = driver.findElements(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		 int w = ss.size();
		 System.out.println(w);
		 
		 for (int i = 0; i < w; i++){
			 
			 WebElement value = ss.get(i);
			 String text = value.getText();
			
			 
			 if ( text.equals("30%"))
			 {
				 System.out.println("pass");
				 System.out.println(text);
				 break;
			 }
			 
		 }
		// ............................Get the progress value of 'Learn to interact with Elements'
				 System.out.println("2..................Get the progress value of 'Learn to interact with Elements");		   
		 
		
	}
}
