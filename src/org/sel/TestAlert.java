package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {

	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
				
		Thread.sleep(2000);
		Alert a =driver.switchTo().alert();
		a.accept();
	
		
	
}
}