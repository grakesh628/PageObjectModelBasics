package com.w2a.pages;

import com.w2a.base.Page;

public class LoginPage extends Page{

	
	public ZohoAppPage doLogin(String userName,String password) {
		
		type("email_CSS",userName);
		click("next_XPATH");
		type("password_CSS",password);
		click("signIn_XPATH");

		return new ZohoAppPage();
	}
	
	public void gotoSalesandMarketing() {
		
	}
	
	public void gotoFinance() {
		
	}
}
