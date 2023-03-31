package org.pages;




import org.libglobalPack.Libglobal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends Libglobal {
	
	public FacebookLoginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private  WebElement txtUserName;
		
	
	@FindBy(id="pass")
	private  WebElement txtpassword;
		
	
	@FindBy(name="login")
	private  WebElement btnlogin;
		
	public  WebElement gettxtUserName() {
		return txtUserName;
	}
	public  WebElement gettxtpassword() {
		return txtpassword;
	}
	public  WebElement getbtnlogin() {
		return btnlogin;
	}
	
}
