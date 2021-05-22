package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CreateAccountPage extends Page{

	public CreateAccountPage createAccount(String accountName) {
		type("createAccountEditBox_XPATH",accountName);
		return new CreateAccountPage();
	}
}
