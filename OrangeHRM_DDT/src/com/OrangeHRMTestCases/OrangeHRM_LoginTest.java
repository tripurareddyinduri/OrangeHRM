package com.OrangeHRMTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_LoginTest {
	public static void main(String[] args) {
	WebDriver driver;
	String applicationUrlAddress = "http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";
	System.setProperty("webdriver.chrome.driver", "./Chrome Driver File/chromedriver.exe");
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
	
	String expected_UrlAddressOfOrangeHRMApplicationLogInPage = "orangehrm.qedge.com";
	System.out.println("The expected UrlAddress Of OrangeHRMApplication LogIn Page is :-"+ expected_UrlAddressOfOrangeHRMApplicationLogInPage);
	
	//getting the Url Address of the Current WebPage _ Google HomePage
	String actual_UrlAddressOfOrangeHRMApplicationWebPage = driver.getCurrentUrl();
	System.out.println("The actual UrlAddress Of OrangeHRMApplication WebPage is :-"+ actual_UrlAddressOfOrangeHRMApplicationWebPage);
	
	if(actual_UrlAddressOfOrangeHRMApplicationWebPage.contains(expected_TitleoforangeHRMApplicationLogInPage))
	{
		System.out.println(" It's a LogIn Page Of OrangeHRM Application - URL Address Matched - PASS");
	}
	else
	{
		System.out.println(" It's Not a LogIn  Page Of OrangeHRM Application - Url Address NOt Matched - FAIL");	
	}
	
	// <input name="txtUsername" id="txtUsername" type="text">
	// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	
	//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	//driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	//driver.findElement(By.className("button")).click();
	
	By UserName = By.id("txtUsername");
	WebElement userName = driver.findElement(UserName);
	userName.sendKeys("Admin");
	
	By Password = By.name("txtPassword");
	WebElement password = driver.findElement(Password);
	password.sendKeys("Qedge123!@#");
	
	By logInButtonL = By.className("button");
	WebElement logInButton = driver.findElement(logInButtonL);
	logInButton.click();
	
	
	// <a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Suresh</a>
	
  By  WelcomSureshL	= By.linkText("Welcome Suresh");
  WebElement WelcomSuresh = driver.findElement(WelcomSureshL);
  WelcomSuresh.click();
  
  
  // <a href="/symfony/web/index.php/auth/logout">Logout</a>
  
  
  //  By Logout = By.xpath("/html/body/div[1]/div[1]/div[9]/ul/li[4]/a");
   // WebElement LogOut = driver.findElement(Logout);
    //LogOut.click();
	driver.quit();
	}
	
	
}
