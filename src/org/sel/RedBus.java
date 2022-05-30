package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	


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
		for(int i=0 ; i<tRows.size(); i++) {
			
			WebElement row = tRows.get(i);
			List<WebElement> tData = driver.findElements(By.tagName("td"));
			for(int j =0; j<tData.size(); j++) {
				WebElement data = tData.get(j);
				String text = data.getText();
				if(text.equals("25")) {
					data.click();
					break;
				}
			}
		}
		driver.findElement(By.xpath("(//button[@id='search_btn']")).click();
		
		}
}
