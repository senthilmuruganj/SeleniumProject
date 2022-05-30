package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.flipkart.com";
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			WebElement target1 =driver.findElement(By.xpath("//button[text()='✕']"));
			target1.click();
			WebElement homeAndFurniture = driver.findElement(By.xpath("//img[@alt='Home']"));
			Actions a = new Actions(driver);
			a.moveToElement(homeAndFurniture).perform();
			Thread.sleep(1000);
					
					WebElement bathTowel =driver.findElement(By.xpath("//a[text()='Bath Towels']"));
					bathTowel.click();
	}
}
