package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseTest;

public class DownloadAndUpload extends BaseTest{
	
	public void uploadFile(String strPath) {
		
		WebElement Upload = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Upload.sendKeys(strPath);
	}
	
	public void downloadFile() {
		
		WebElement Download = driver.findElement(By.xpath("//a[@id='downloadButton']"));
		Download.click();
	}

}
