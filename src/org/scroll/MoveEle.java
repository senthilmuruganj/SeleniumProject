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

public class MoveEle {

	

public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement target =driver.findElement(By.xpath("//button[text()='✕']"));
		target.click();
		WebElement target2 =driver.findElement(By.xpath("//div[text()='Mobiles']"));
		target2.click();
		Thread.sleep(1000);
		WebElement target1 =driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		Actions a = new Actions(driver);
		a.moveToElement(target1).perform();
		Thread.sleep(1000);
		
				
		TakesScreenshot js = (TakesScreenshot)driver;
		File sa=js.getScreenshotAs(OutputType.FILE);
		String title= driver.getTitle();
		File tar= new File("C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\screenshot\\flipcart.png");
		FileUtils.copyFile(sa, tar);
}
}
