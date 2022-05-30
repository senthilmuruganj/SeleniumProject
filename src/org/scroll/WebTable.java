package org.scroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	

public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://cosmocode.io/automation-practice-webtable/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement table =driver.findElement(By.xpath("//table[@id='countries']"));
		List<WebElement> tRow = table.findElements(By.tagName("tr"));
		for(WebElement a : tRow ) {
			List<WebElement> tCol = table.findElements(By.tagName("td"));
			for(WebElement b:tCol) {
				String c =b.getText();
				System.out.println(c);
			}
		}
}
}
