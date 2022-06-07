package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseTest;

public class CheckboxActions extends BaseTest {
	
	public void expandHomeCheckboxOptions() {
		WebElement HomeSVG = driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
		HomeSVG.click();
	}
	
	public void checkDesktopCheckbox() {
		WebElement Desktop = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
		Desktop.click();
		
	}
	
	public void verifyDesktopCheckboxIsDisplayed() {
		WebElement Desktop = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
		if(Desktop.isDisplayed()) {
			System.out.println("Desktop option is Displayed");
		}else {
			System.out.println("Desktop option is not displayed");
		}
	}
	
	public void verifyDesktopCheckboxIsEnabled() {
		WebElement Desktop = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
		if(Desktop.isEnabled()) {
			System.out.println("Desktop option is Enabled");
		}else {
			System.out.println("Desktop option is not Enabled");
		}
	}
	
	public void verifyDesktopCheckboxIsSelected() {
		WebElement Desktop = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
		if(Desktop.isSelected()) {
			System.out.println("Desktop checkbox is selected");
		}else {
			System.out.println("Checkbox is not selected");
		}
	}
	
	public void expandDesktopOption() {
		WebElement DesktopSVG = driver.findElement(By.xpath("(//button[@class='rct-collapse rct-collapse-btn'])[2]"));
		DesktopSVG.click();
	}
	
	public void checkCommandsCheckbox() {
		WebElement Commands = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[4]"));
		
		if(Commands.isDisplayed()) {
			
			if(Commands.isEnabled()) {
				
				if(Commands.isSelected()) {
					System.out.println("Checkbox is already selected");
				}else {
					Commands.click();
					System.out.println("Clicked on Checkbox");
				}
								
			}else {
				System.out.println("Checkbox is Disabled");
			}
			
		}else {
			System.out.println("Checkbox is not displayed");
		}
		
	}
	

	
	

}
