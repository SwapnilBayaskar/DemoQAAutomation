package com.Test;

import com.Pages.DatePicker;

public class TestDatePicker {

	public static void main(String[] args) {
		
		DatePicker objDatePicker = new DatePicker();
		
		objDatePicker.initializeBrowser("https://demoqa.com/date-picker");
		objDatePicker.openCalendor();
		objDatePicker.selectMonth("April");
		objDatePicker.selectYear("2020");
		objDatePicker.selectDate();

	}

}
