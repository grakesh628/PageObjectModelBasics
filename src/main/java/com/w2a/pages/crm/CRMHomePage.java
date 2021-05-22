package com.w2a.pages.crm;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CRMHomePage extends Page{

	public void verifyWelcomeText() {
		driver.findElement(By.xpath("//span[@id='show-uName']")).isDisplayed();
	}
	
	public void verifyCMRText() {
		driver.findElement(By.xpath("//*[@id='mainMenuTabDiv']/crm-menu/div[1]/div/link-to/a/img")).isDisplayed();
	}
}
