package com.Test;

import com.Pages.CheckboxActions;

public class TestCheckboxActions {

	public static void main(String[] args) {
		
		CheckboxActions objCheckboxActions = new CheckboxActions();
		
		objCheckboxActions.initializeBrowser("https://demoqa.com/checkbox");
		objCheckboxActions.expandHomeCheckboxOptions();
		//objCheckboxActions.checkDesktopCheckbox();
		//objCheckboxActions.verifyDesktopCheckboxIsDisplayed();
		//objCheckboxActions.verifyDesktopCheckboxIsEnabled();
		//objCheckboxActions.verifyDesktopCheckboxIsSelected();
		
		objCheckboxActions.expandDesktopOption();
		objCheckboxActions.checkCommandsCheckbox();
		

	}

}
