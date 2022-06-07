package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.BaseTest;

public class RadioButtonActions extends BaseTest{
	
	public void selectYesOption() {
		WebElement YesOption = driver.findElement(By.xpath("//input[@id='yesRadio']"));
		YesOption.click();
	}
	
	public void selectImpressiveOption() {
		WebElement ImpressiveOption = driver.findElement(By.xpath("(//input[@class='custom-control-input'])[2]"));
		ImpressiveOption.click();
	}

}
