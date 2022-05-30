package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SprintNew {



	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.sprint.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Continue to Sprint']")).click();
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
				
		Thread.sleep(3000);
		Alert a =driver.switchTo().alert();
		a.accept();
}
}
