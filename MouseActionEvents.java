package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Base.BaseTest;

public class MouseActionEvents extends BaseTest{
	
	public void dragAndDrop() {
		WebElement From = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement To = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(From, To).build().perform();
	}
	
	public void doubleClick() {
		
		WebElement DoubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions action = new Actions(driver);
		action.doubleClick(DoubleClickButton).build().perform();
	}
	
	public void rightClick() {
		
		WebElement RightClickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		Actions action = new Actions(driver);
		action.contextClick(RightClickButton).build().perform();
	}
	
	public void mouseHover() {
		
		WebElement HoverButton = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(HoverButton).build().perform();
	}
	

}
