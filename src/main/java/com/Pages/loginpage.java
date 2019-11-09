package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;

public class loginpage extends Baseclass {
	//public static WebDriver driver;
	public loginpage(){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="txtUserName")
	WebElement user;
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement pwd; 
	@FindBy(name="Submit")
	WebElement button;
	public boolean  verifyTitle(String title)
	{
		if(driver.getTitle().equals(title)){
			return true;
		}
		else {
			return false;
		}
		
			
		
		
	}
	public boolean verifyUser(){
		boolean verifyu=user.isDisplayed()&&user.isEnabled();
		return verifyu;
		
	}
	public boolean verfypwd(){
		boolean verifypwd=pwd.isDisplayed()&&pwd.isEnabled();
		return verifypwd;
	}
	public Homepage  testUser(String un,String pwds){
		
		user.sendKeys(un);
		pwd.sendKeys(pwds);
		button.click();
		return new Homepage();
	}

}
