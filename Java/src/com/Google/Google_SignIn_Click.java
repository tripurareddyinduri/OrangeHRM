package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_Click {
public static void main(String[] args) {
	WebDriver driver;
	String applicationUrlAddress = "https://google.com";
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	
	// 1.Identify the Element
	// 2.Perform the Operation on the Element
	
	By signInL = By.linkText("Sign in");
	WebElement signIn = driver.findElement(signInL);
	
	//getting the text of "Sign In" Element
	String signInElementText = signIn.getText();
	//getText method used to get the text
	System.out.println("the text of element SignIn is:-  "+ signInElementText);
	
	// On the same Element - Using the Variable - performing another Operation
	signIn.click();
	//driver.quit();
}
}
