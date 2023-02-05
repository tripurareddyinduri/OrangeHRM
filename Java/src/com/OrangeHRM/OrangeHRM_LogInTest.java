package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM_LogInTest {
public static void main(String[] args) {
	WebDriver driver;
	String applicationUrlAddress = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	
	//Validating the Login Page Of OrangeHRM Application
	String expected_TitleoforangeHRMApplicationLogInPage = "OrangeHRM";
	System.out.println("The expected Title of the OrangeHRM Application LogIn Page is:-"+expected_TitleoforangeHRMApplicationLogInPage);
	String actual_TitleOfOrangeHRMApplicationLogInPage = driver.getTitle();
	System.out.println("The actual Title of OrangeHRM Appalication WebPage is :-"+actual_TitleOfOrangeHRMApplicationLogInPage);
	if(actual_TitleOfOrangeHRMApplicationLogInPage.equals(expected_TitleoforangeHRMApplicationLogInPage))
	{
		System.out.println("Its a LogIn Page of OrangeHRM Appalication - PASS");
	}
	else
	{
		System.out.println("Its NOT a LogIn Page of OrangeHRM Appalication - FAIL");
	}
	
	String expected_GoogleHomePageUrlAddress = "google.com";
	System.out.println("The expected Url Address of Google HomePage is :-"+expected_GoogleHomePageUrlAddress);
	
	//getting the Url Address of the Current WebPage _ Google HomePage
	String actual_GoogleHomePageCuurentUrlAddress = driver.getCurrentUrl();
	System.out.println("The Actual Current Url Address of the Google Home Page is :-"+actual_GoogleHomePageCuurentUrlAddress);
	
	if(actual_GoogleHomePageCuurentUrlAddress.contains(expected_TitleoforangeHRMApplicationLogInPage))
	{
		System.out.println(" The Url Address of the HomePage Matched - PASS");
	}
	else
	{
		System.out.println(" The Url Address of the HomePage Not Matched - FAIL");
		
	}
	
	
	//<input class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="" data-v-844e87dc="">
	
	//<input class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="" data-v-844e87dc="">
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tripura");
	//<input class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password" data-v-844e87dc="">
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Q@Trainer7");
	driver.findElement(By.xpath("//*[text()='Login']")).click();
//	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*//Testig the LogIN  Functionality of OrangeHRM Application
	//Identifying The Properties of UserName Element under Test - By inspecting the element
	//<input name = "txtUsername" id = "txtUsername" type = "text"
	
	//<input class="oxd-input oxd-input--active oxd-input--error" name="username" placeholder="Username" autofocus="" data-v-844e87dc="">
	
	//In the Properties - identify the Loactor and its Corresponding selector
	//Locator (attribute) - id
    // selector (value) - txtUsername
	
	// To identify an element at least One Locator and its corresponding selector is required
	//driver.findElement(By.id("username")).sendKeys("tripura");
	
	//<input name = "txtPassword" autocomplet = "off" type = "password"
	//<input class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password" data-v-844e87dc="">
	//id- locator
	//txtpassword - selector
	
	//Name = locator
	//txtPassword - selector
	
	//driver.findElement(By.id("password")).sendKeys("Q#@Trainer7");
	
	//driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");
	
	driver.findElement(By.id("txtPassword")).sendKeys("tripura");
	//<p class="oxd-text oxd-text--p" data-v-7588b244="" data-v-30b9e6c4="">Username : Admin</p>*/
	//driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");
	
	
}
}
