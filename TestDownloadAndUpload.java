package com.Test;

import com.Pages.DownloadAndUpload;

public class TestDownloadAndUpload {

	public static void main(String[] args) {
		
		DownloadAndUpload objDownloadAndUpload = new DownloadAndUpload();
		
		objDownloadAndUpload.initializeBrowser("https://demoqa.com/upload-download");
		objDownloadAndUpload.uploadFile("C:\\\\Users\\\\Admin\\\\Desktop\\\\Picture1.png");
		
		objDownloadAndUpload.downloadFile();

	}

}
