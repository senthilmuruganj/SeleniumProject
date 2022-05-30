package org.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {


public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUDHASEN\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement target =driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		target.click();
		Thread.sleep(2000);
		WebElement firstName =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstName.sendKeys("senthilmurugan");
		WebElement surName =driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surName.sendKeys("jayapal");
		WebElement mobileNo =driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobileNo.sendKeys("9965309666");
		WebElement passWord =driver.findElement(By.xpath("//input[@id='password_step_input']"));
		passWord.sendKeys("9965309666");
		
		WebElement dropDown =driver.findElement(By.id("day"));
		
		Select s =new Select(dropDown);
		s.selectByIndex(15);
        WebElement dropDown1 =driver.findElement(By.id("month"));
		
		Select m =new Select(dropDown1);
		m.selectByValue("5");
        WebElement dropDown2 =driver.findElement(By.id("year"));
		
		Select y =new Select(dropDown2);
		y.selectByValue("1979");
		
		WebElement radioBtn =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radioBtn.click();

		WebElement signBtn =driver.findElement(By.xpath("//button[text()='Sign Up']"));
		signBtn.click();
}
}
