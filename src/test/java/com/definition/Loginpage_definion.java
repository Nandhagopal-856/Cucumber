package com.definition;

import org.libglobalPack.Libglobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.pages.FacebookLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
            
public class Loginpage_definion extends Libglobal {
public  FacebookLoginPage obj;//global
	@Given("user launch the facebook webb application")
	public void user_launch_the_facebook_webb_application() {
	 getDriver();
	 loadUrl("https://www.facebook.com");
	}
	

	@When("user enters the valid username and balid password")  //snippets
	public void user_enters_the_valid_username_and_balid_password() {
		obj = new FacebookLoginPage();
		sendInput(obj.gettxtUserName(), "abc@123");
		sendInput(obj.gettxtpassword(), "aabbcc");
	}

	@When("user needs clic the login button")
	public void user_needs_clic_the_login_button() {	
		buttonClick(obj.getbtnlogin());
	}

	@Then("verify user is naviagting to homepage or not")
	public void verify_user_is_naviagting_to_homepage_or_not() {
	 
	}
	@When("user enters the valid {string} and balid {string}")
	public void user_enters_the_valid_and_balid(String username, String password) {
		obj = new FacebookLoginPage();
		sendInput(obj.gettxtUserName(), username);
		sendInput(obj.gettxtpassword(), password);
		buttonClick(obj.getbtnlogin());
	}


	}


