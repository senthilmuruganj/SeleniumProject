package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {

	

	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://netbanking.hdfcbank.com/netbanking/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("42543629");
		
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
				
		
}
}
