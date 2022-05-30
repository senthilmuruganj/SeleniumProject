package org.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown1 {

	

public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://toolsqa.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement target1 =driver.findElement(By.xpath("//a[text()='Selenium Training']"));
		target1.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", target1);
}
}
