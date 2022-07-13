package org.sel;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSnap {



	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.amazon.com";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung ac");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();

		TakesScreenshot ts= (TakesScreenshot)driver;
		File as = ts.getScreenshotAs(OutputType.FILE);
		String title =driver.getTitle();
		File at = new File("C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\screenshot\\amazon.png");
		FileUtils.copyFile(as, at);
	}
}