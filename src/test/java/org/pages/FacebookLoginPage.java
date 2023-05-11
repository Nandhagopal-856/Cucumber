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
	private static   WebElement txtUserName;
		
	
	@FindBy(id="pass")
	private static  WebElement txtpassword;
		
	
	@FindBy(name="login")
	private static WebElement btnlogin;
		
	public static WebElement gettxtUserName() {
		return txtUserName;
	}
	public static WebElement gettxtpassword() {
		return txtpassword;
	}
	public static WebElement getbtnlogin() {
		return btnlogin;
	}
	
}
