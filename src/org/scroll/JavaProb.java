package org.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaProb {


public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.adactinhotelapp.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement userTxt =driver.findElement(By.id("username"));
		WebElement passTxt =driver.findElement(By.id("password"));
		WebElement loginTxt =driver.findElement(By.id("login"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','senthilmurugan')", userTxt);
		js.executeScript("arguments[0].setAttribute('value','java')", passTxt);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", loginTxt);
		Thread.sleep(3000);
		
		
}
}
