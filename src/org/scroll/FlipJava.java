package org.scroll;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipJava {


public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("9965309666");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("sudhasen3214@");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(home).perform();
		Thread.sleep(3000);		
		
		driver.findElement(By.xpath("//a[text()='Home Decor']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains (text(),'Flipkart SmartBuy W')]")).click();
		String prWin =driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles(); 

		for(String sWin:allWin) {
			if(!sWin.equals(allWin)) {
				driver.switchTo().window(sWin);
			}
		}
		
		driver.findElement(By.xpath("//button[text()='GO TO CART']")).click();
		Thread.sleep(3000);
		TakesScreenshot js = (TakesScreenshot)driver;
		File sa=js.getScreenshotAs(OutputType.FILE);
		
		File tar= new File("C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\screenshot\\flipshot.png");
		FileUtils.copyFile(sa, tar);
}
}
