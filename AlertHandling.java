package com.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.BaseTest;

public class AlertHandling extends BaseTest{
	
	public void getSimpleAlert() {
		WebElement AlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		AlertButton.click();
		
	}
	
	public void getConfirmationAlert() {
		WebElement ConfirmAlertButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ConfirmAlertButton.click();
	}
	
	public void getPromptAlert() {
		WebElement PromptAlertButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		PromptAlertButton.click();
	}
	
	public void printAlertMessage() {
		Alert alert = driver.switchTo().alert();
		
		String strAlertMsg = alert.getText();
		System.out.println("Alert message is : "+strAlertMsg);
	}
	
	public void sendTextToAlert() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Swapnil");
	}
	
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	


}
