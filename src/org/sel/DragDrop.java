package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in";
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement source = driver.findElement(By.xpath("//span[text()='Prime']"));
					source.click();
					
					WebElement target =driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
					target.click();
	}

}
