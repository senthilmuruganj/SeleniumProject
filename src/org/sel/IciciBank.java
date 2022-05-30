package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {

	


	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI";
		driver.get(url);
		driver.manage().window().maximize();
		driver.switchTo().frame("resp-iframe");
		
		driver.findElement(By.xpath("//input[@title='Login using User ID and password']")).click();
		
				
		Thread.sleep(3000);
		Alert a =driver.switchTo().alert();
		a.accept();
}
}
