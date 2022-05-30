package org.scroll;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveEle1 {



public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.snapdeal.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement target2 =driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		target2.sendKeys("HP Laptop");
		Thread.sleep(1000);
		WebElement target1 =driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		target1.click();
		
				
		TakesScreenshot js = (TakesScreenshot)driver;
		File sa=js.getScreenshotAs(OutputType.FILE);
		String title= driver.getTitle();
		File tar= new File("C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\screenshot\\snapdeal.png");
		FileUtils.copyFile(sa, tar);
}
}
