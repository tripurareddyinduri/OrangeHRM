package com.GetTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_GetTitle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	ChromeDriver driver =  new ChromeDriver();
	
	//Navigating to Bing Application Home Page
	driver .get("http://bing.com");
	String  a = driver.getTitle();
	//getTitle() methode is used to identify the title of the webpage
	// printing the identified Title of the Bing Application HomePage
	System.out.println("The Title of the Bing HomePage is :- a ");
	//closing the Browser
	driver.close();
}
}
