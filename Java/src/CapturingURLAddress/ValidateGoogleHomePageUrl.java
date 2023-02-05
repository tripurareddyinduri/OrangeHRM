package CapturingURLAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateGoogleHomePageUrl {
	public static void main(String[] args) {
		WebDriver driver;
		String ApplicationUrlAddress = "http://google.com";
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		
		//getting the title of the Google HomePage
		String actual_GoogleHomePageTitle = driver.getTitle();
		System.out.println("The actual Google HomePage Title is :- "+ actual_GoogleHomePageTitle);
		
		//getting the url address of the current webpage-Google HomePage
		String actual_GoogleHomePageCurrentUrlAddress = driver.getCurrentUrl();
		System.out.println("The current Url Address of the Google Home Page is :- "+actual_GoogleHomePageCurrentUrlAddress);
		//driver.close();
		//https://www.google.com/?gws_rd=ssl
		
		String expected_GoogleHomePageTitle = "Google";
		System.out.println("The expected Title of Google HomePage is :-"+expected_GoogleHomePageTitle);
		
		//Getting the title of the Google Homepage
		String actual_GoogleHomePageTitle1 = driver.getTitle();
		System.out.println("The actual Google HomePage Title is :- "+ actual_GoogleHomePageTitle);
		
		//validate title of google home page
		if(actual_GoogleHomePageTitle.equals(expected_GoogleHomePageTitle))
		{
			System.out.println("Google HomePage Title matched - PASS");
			
		}else {
			System.out.println("Google HomePage Title matched - FAIL");
		}
		
		String expected_GoogleHomePageUrlAddress = "google.com";
		System.out.println("The expected Url Address Of Google Home Page is :-"+ expected_GoogleHomePageUrlAddress);
		
		//getting the url Address of the Current WebPage - Google HomePage
		String actual_GoogleHomePageCurrentUrlAddress1 = driver.getCurrentUrl();
		System.out.println("The Actual Current Url Address of the Google Home Page is :-" + actual_GoogleHomePageCurrentUrlAddress1);
		
		if(actual_GoogleHomePageCurrentUrlAddress1.contains(expected_GoogleHomePageUrlAddress)) {
			System.out.println("The Url Address of the Home Page Matched - PASS");
			
		}
		else
		{
			System.out.println("The Url Address of the Home Page Not Matched _ FAIL");
		}
		
		driver.close();
		
		
		
	}
}
