package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus1 {

	


public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.redbus.in/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='db'])[1]")).sendKeys("coimbatore");
		driver.findElement(By.xpath("(//input[@class='db'])[2]")).sendKeys("chennai");
		driver.findElement(By.xpath("(//input[@class='db'])[3]")).click();
		Thread.sleep(2000);
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for(WebElement x : tRows) {
			List<WebElement> tData = x.findElements(By.tagName("td"));
			for(WebElement y : tData) {
				String text = y.getText();
				if(text.equals("25")) {
					y.click();
					break;
			
			
				}
			}
		}
		
		
		}
}
