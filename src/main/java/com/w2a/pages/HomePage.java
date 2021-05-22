package com.w2a.pages;

import org.openqa.selenium.By;
import com.w2a.base.Page;

public class HomePage extends Page{

	
	public void goToSupport() {
		click("supportLink_CSS");
	}
	
	public void goToSignup() {
		click("signupLink_CSS");
	}
	
	public LoginPage goToLogin() {
		
		click("loginLink_CSS");
		
		return new LoginPage();
	}
	
	public void goToZohoEdu() {
		
	}
	
	public void goToLearnMore() {
		click("learnMore_CSS");
	}
	
	public void validateFooterLinks() {
		
	}
}
