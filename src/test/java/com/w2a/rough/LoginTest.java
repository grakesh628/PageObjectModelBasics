package com.w2a.rough;



import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {
	//this is rough package
	public static void main(String[] args) {
			
		HomePage home  = new HomePage();
		LoginPage loginPage = home.goToLogin();
		ZohoAppPage zohoAppsPage = loginPage.doLogin("grakesh628@gmail.com", "Vault12#");
		zohoAppsPage.gotoCRM();
		AccountsPage accountsPage = Page.menu.gotoAccounts();
		CreateAccountPage createAccountPage = accountsPage.gotoCreateAccount();
		createAccountPage.createAccount("Rakesh");
		
	}
}
