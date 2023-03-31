package org.libglobalPack;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.FacebookLoginPage;

public class Libglobal {
	public static WebDriver driver;//global variable
	public FacebookLoginPage obj;
public static WebDriver getDriver() {
	driver=new ChromeDriver();
	return driver;
}
public static void loadUrl(String url) {
	driver.get(url);
}
public static void maxiwindow() {
		driver.manage().window().maximize();
	}

public static void sendInput(WebElement element,String input) {
	element.sendKeys(input);;
}
public static void buttonClick(WebElement element) {
	element.click();
}
}
