package com.Test;

import com.Pages.RadioButtonActions;

public class TestRadioButtonActions {

	public static void main(String[] args) {
		
		RadioButtonActions objRadioButtonActions = new RadioButtonActions();
		
		objRadioButtonActions.initializeBrowser("https://demoqa.com/radio-button");
		objRadioButtonActions.setImplicitWait(5);
		//objRadioButtonActions.selectYesOption();
		objRadioButtonActions.selectImpressiveOption();

	}

}
