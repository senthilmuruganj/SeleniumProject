package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraBank {

	

	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://netbanking.canarabank.in/entry/ENULogin.jsp";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
				
		Thread.sleep(3000);
		Alert a =driver.switchTo().alert();
		a.accept();
}
}
