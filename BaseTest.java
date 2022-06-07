package com.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	public void initializeBrowser(String strURL) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe"); //Setting the chromedriver path
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get(strURL);		
	}
	
	public void setImplicitWait(int intWait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(intWait));
	}

}
