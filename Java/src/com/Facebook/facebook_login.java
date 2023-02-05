package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login {
public static void main(String[] args) {
	WebDriver driver;
	String applicationUrlAddress = "https://www.facebook.com/login.php/";
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	
	//getting the title of the Facebook HomePage
		String actual_FacebookHomePageTitle = driver.getTitle();
		System.out.println("The actual Facebook HomePage Title is :- "+ actual_FacebookHomePageTitle);
		
		//getting the url address of the current webpage-Facebook HomePage
		String actual_FacebookHomePageCurrentUrlAddress = driver.getCurrentUrl();
		System.out.println("The current Url Address of the Facebook Home Page is :- "+actual_FacebookHomePageCurrentUrlAddress);
		
		//<input type="text" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt" name="email" id="email" tabindex="0" placeholder="Email address or
		//phone number" value="" autofocus="1" autocomplete="username" aria-label="Email address or phone number">
		
		driver.findElement(By.id("email")).sendKeys("induritripurareddy09@gmail.com");
		
		// <div class="_55r1 _1kbt"><input type="password" class="inputtext _55r1 inputtext _9npi inputtext _9npi" name="pass" id="pass" tabindex="0" placeholder="Password"
		//value="" autocomplete="current-password" aria-label="Password"><div class="_9ls7 hidden_elem" id="u_0_3_1G"><a href="#" role="button"><div class="_9lsa"><div class="_9lsb" id="u_0_4_k5"></div></div></a></div></div>
		
		driver.findElement(By.name("pass")).sendKeys("Tripura@9441");
		
		// <button value="1" class="_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy" id="loginbutton" name="login" tabindex="0" type="submit">Log in</button>
	
		driver.findElement(By.name("login")).click();
		
		//driver.quit();
		
		driver.close();
}
}
