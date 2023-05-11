package org.libglobalPack;



import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.pages.FacebookLoginPage;

public class Libglobal {
	public static WebDriver driver;//global variable
//	public FacebookLoginPage obj;
	

public static WebDriver getDriver() {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(co);// webdriver - interface driver - obj chrome driver - class
	return driver;
}
public static void loadUrl(String url) {
	driver.get(url);
}
public static void sendInput(WebElement element,String input) {
	element.sendKeys(input);;
}
public static void buttonClick(WebElement element) {
	element.click();
}
}
