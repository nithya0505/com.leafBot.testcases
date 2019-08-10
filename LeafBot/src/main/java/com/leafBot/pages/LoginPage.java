package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage() { // Pagefactory code
	}

	public LoginPage enterUsername(String username) {
//		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement ele = locateElement("id","username");
		clearAndType(ele, username);
		return this;
	}

	public LoginPage enterPassword(String password) {
//		driver.findElementById("password").sendKeys("crmsfa");
		WebElement pwd = locateElement("id","password");
		clearAndType(pwd, password);
		return this;
	}

	public HomePage clickLogin() {
//		driver.findElementByClassName("decorativeSubmit").click();
		WebElement sub = locateElement("ClassName","decorativeSubmit");
		click(sub);
		/*
		 * HomePage page = new HomePage(); return page;
		 */
		return new HomePage();
	}

}

