package com.OrangeHRMTestCases;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoIt {
	public static void main(String[] args) {
		
	
	WebDriver driver;
	String applicationUrlAddress = "http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";
	System.setProperty("webdriver.chrome.driver", "./Chrome Driver File/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	

	
}
}
