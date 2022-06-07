package com.Test;

import com.Pages.MouseActionEvents;

public class TestMouseActionEvents {

	public static void main(String[] args) {
		
		MouseActionEvents objMouseActionEvents = new MouseActionEvents();
		
		//objMouseActionEvents.initializeBrowser("https://demoqa.com/droppable");
		//objMouseActionEvents.dragAndDrop();
		
		//objMouseActionEvents.initializeBrowser("https://demoqa.com/buttons");
		//objMouseActionEvents.doubleClick();
		
		//objMouseActionEvents.rightClick();
		
		
		objMouseActionEvents.initializeBrowser("https://demoqa.com/tool-tips");
		objMouseActionEvents.mouseHover();
		

	}

}
