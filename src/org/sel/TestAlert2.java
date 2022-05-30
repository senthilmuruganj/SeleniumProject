package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert2 {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.automationtesting.in/Alerts.html";
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Alert with Textbox '] ")).click();
			driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
			
			Thread.sleep(2000);
			Alert a =driver.switchTo().alert();
			a.sendKeys("senthilmurugan");
			a.accept();
	}
}
