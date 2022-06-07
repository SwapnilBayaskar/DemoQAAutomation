package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.BaseTest;

public class DatePicker extends BaseTest{
	
	public void openCalendor() {
		WebElement Calendor = driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
		Calendor.click();
				
		//List<WebElement> list = driver.findElements(By.xpath("//div[@class='react-datepicker__month']"));
		//System.out.println("List is : "+list.size());
	}
	
	public void selectMonth(String strMonth) {
		WebElement MonthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select Month = new Select(MonthDropdown);
		Month.selectByVisibleText(strMonth);
	}
	
	public void selectYear(String strYear) {
		WebElement YearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select Year = new Select(YearDropdown);
		Year.selectByVisibleText(strYear);
	}
	
	public void selectDate() {
		WebElement Date = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--013']"));
		Date.click();
	}

}
