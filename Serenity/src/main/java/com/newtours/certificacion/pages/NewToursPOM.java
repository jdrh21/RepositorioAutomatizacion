package com.newtours.certificacion.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com")
public class NewToursPOM extends PageObject{
	
	@FindBy(name="userName")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="login")
	WebElement btnlogin;

	public void writeData(String usuario, String password) {
		txtusername.sendKeys(usuario);
		txtpassword.sendKeys(password);
		
	}

	public void sendData() {
		btnlogin.click();
		
	}
	
	

}
