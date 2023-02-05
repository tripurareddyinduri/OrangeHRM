package com.ValidatingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_BingHomePage {
public static void main(String[] args) {
	//Automating chrome Browser
	
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	/*//ChromeDriver driver =  new ChromeDriver();
	
	//Navigating to Bing Application Home Page
	//driver .get("http://bing.com");
	//System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");*/
	
	WebDriver driver = new ChromeDriver();
	//Navigating to bing application home page
	driver.get("http://bing.com");
	
	//Client Requirement the title of Bing HomePage should be "Bing"
	String expected_BingHomePageTitle  = "Bing";
	//Client Requirement saved into a variable 
	System.out.println("The expected Title of Bing HomePage is : "+ expected_BingHomePageTitle);
	
	//Getting the title of the Bing Home Page-developed By the developer
	String actual_BingHomePageTitle = driver.getTitle();
	System.out.println("The expected Title of Bing HomePage is : "+ actual_BingHomePageTitle);
	
	//Validating the title of the bing home page
	if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
	{
		System.out.println("Both The actual and expected Bing HomePage Title are the same-PASS");
	}
	else
	{
		System.out.println("Both The actual and expected Bing HomePage Title are not the same-FAIL ");
	}
	
	//driver.close();
	driver.quit();
	
	
	
}
}
