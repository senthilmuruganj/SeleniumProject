package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiBank {

	


	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://retail.onlinesbi.com/retail/login.htm";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN'][1]")).click();
		driver.findElement(By.xpath("//input[@title='Login']")).click();		
		Thread.sleep(3000);
		Alert a =driver.switchTo().alert();
		a.accept();
}
}
