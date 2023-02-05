package com.MouseHoverOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon_YourWishList_Click {
public static void main(String[] args) {
	WebDriver driver;
	String applicationUrlAddress = "https://www.amazon.in/";
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
    driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Maximize the Browser
	driver.manage().window().maximize();
	
	// Automating hello SignIn Element
	// id = "nav-link-accountList"
	By helloSignInLocator = By.id("nav-link-accountList");
    WebElement helloSignIn = driver.findElement(helloSignInLocator);
    // Performing Mouse Hover Operation on helloSignIn Element Using Actions Class
    // Form the Package - org.openqa.selenium.interactoins.Actions
	
   Actions actions = new Actions(driver);
   // Performing action on the current WebPage
   actions.moveToElement(helloSignIn).build().perform();
   //moving to hello signIn
   // Automating you Wish List (hidden Element)
   By yourWishListLocator = By.linkText("Your Wish List");
   WebElement yourWishList = driver.findElement(yourWishListLocator);
   yourWishList.click();
   System.out.println(driver.getTitle());
   System.out.println(driver.getCurrentUrl());
   driver.quit();
	
}
}
