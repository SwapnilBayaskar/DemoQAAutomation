package com.Test;

import com.Pages.AlertHandling;

public class TestAlertHandling {

	public static void main(String[] args) {
		
		AlertHandling objAlertHandling = new AlertHandling();
		
		objAlertHandling.initializeBrowser("https://demoqa.com/alerts");
		
		//objAlertHandling.getSimpleAlert();
		//objAlertHandling.getConfirmationAlert();
		objAlertHandling.getPromptAlert();
		
		objAlertHandling.printAlertMessage();
		objAlertHandling.sendTextToAlert();
		
		objAlertHandling.acceptAlert();
		//objAlertHandling.dismissAlert();

	}

}
