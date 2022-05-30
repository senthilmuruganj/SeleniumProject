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

public class ScrollPrint {



public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement target =driver.findElement(By.xpath("//button[text()='✕']"));
		target.click();
		WebElement target1 =driver.findElement(By.xpath("//input[@type='text']"));
		target1.sendKeys("iphones");
		WebElement butClick = driver.findElement(By.xpath("//button[@type='submit']"));
		butClick.click();
		
		TakesScreenshot js = (TakesScreenshot)driver;
		File sa=js.getScreenshotAs(OutputType.FILE);
		String title= driver.getTitle();
		File tar= new File("C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\screenshot\\flip"+title+".png");
		FileUtils.copyFile(sa, tar);
}
}
