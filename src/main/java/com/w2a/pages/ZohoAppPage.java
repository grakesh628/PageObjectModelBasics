package com.w2a.pages;

import org.openqa.selenium.By;


import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{

	public void gotoBooks() {
		
		click("booksLink_XPATH");
	}
	
	public void gotoCalendar() {
		click("calendarLink_XPATH");
	}
	
	public void gotoCampaingns() {
		click("campaingnsLink_XPATH");
	}
	
	public void gotoCliq() {
		click("cliqLink_XPATH");
	}
	
	public void gotoConnect() {
		click("connectLink_XPATH");
	}
	
	public CRMHomePage gotoCRM() {
		click("crmLink_XPATH");
		return new CRMHomePage();
	}
	
	public void gotoDesk() {
		click("deskLink_XPATH");
	}
	
	public void gotoInvoice() {
		driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[8]/div/a/div[text()='Invoice']")).click();
	}
	
	public void gotoMail() {
		driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[9]/div/a/div[text()='Mail']")).click();
	}
	
	public void gotoSheet() {
		driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[10]/div/a/div[text()='Sheet']")).click();
	}
	
	public void gotoShow() {
		driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[11]/div/a/div[text()='Show']")).click();
	}
	
	public void gotoWorkDrive() {
		driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[12]/div/a/div[text()='WorkDrive']")).click();
	}
	
	public void gotoWriter() {
		driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[13]/div/a/div[text()='Writer']")).click();
	}
}
