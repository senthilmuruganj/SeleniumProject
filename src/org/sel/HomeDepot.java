package org.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {

	

	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.homedepot.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("(//input[@id='headerSearch']")).sendKeys("celling fan");
		driver.findElement(By.xpath("//button[@title='Submit Search']")).click();	
		Thread.sleep(2000);
		
}
}
