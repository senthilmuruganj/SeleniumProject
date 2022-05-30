package org.scroll;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown4 {

	

public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement userTxt =driver.findElement(By.id("email"));
		WebElement passTxt =driver.findElement(By.name("pass"));
		WebElement loginTxt =driver.findElement(By.name("login"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','senthilmurugan')", userTxt);
		js.executeScript("arguments[0].setAttribute('value','java')", passTxt);
		js.executeScript("arguments[0].click()", loginTxt);
		Thread.sleep(5000);
		
		
}
}
