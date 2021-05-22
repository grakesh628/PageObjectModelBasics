package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {

	/*
	 * 
	 * 
	 * TopMenu ISA page ??
	 * 
	 * HomePage HASA TopMenu
	 * AccountPage HASA TopMenu
	 * 
	 * Page HASA TopMenu
	 * 
	 * 
	 */
	
	WebDriver driver ;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}
	public void gotoHome() {

	}

	public void gotoFeeds() {

	}

	public void gotoLeads() {

	}

	public AccountsPage gotoAccounts() {
		Page.click("accountTab_XPATH");
		return new AccountsPage();
	}

	public void gotoContacts() {

	}

	public void gotoActivities() {
		
	}

	public void gotoDeals() {

	}

	public void signOut() {

	}
}
