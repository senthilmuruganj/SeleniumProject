package org.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapWind {


	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.snapdeal.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("iphones 7");
		driver.findElement(By.xpath("//span[text()='Search']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(text(),'Apple')])[2]")).click();		
		String pWin=  driver.getWindowHandle();
		  Set<String> allWin = driver.getWindowHandles();
		  for(String x: allWin) {
			  if(!x.equals(pWin)){
				driver.switchTo().window(x);  
			  }
		  }
		  WebElement price=driver.findElement(By.xpath("//span[text()='add to cart']"));
		  String text=price.getText();
		  System.out.println(text);
}
}
