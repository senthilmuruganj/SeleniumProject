package org.sel;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHand {

	

	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.amazon.com";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphones x");
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
		driver.findElement(By.xpath("//span[contains(text(),'ORNARTO')]")).click();		
	  String pWin=  driver.getWindowHandle();
	  Set<String> allWin = driver.getWindowHandles();
	  for(String x: allWin) {
		  if(!x.equals(pWin)){
			driver.switchTo().window(x);  
		  }
	  }
	  WebElement price=driver.findElement(By.xpath("//span[text()='$13.99']"));
	  String text=price.getText();
	  System.out.println(text);
}
}
