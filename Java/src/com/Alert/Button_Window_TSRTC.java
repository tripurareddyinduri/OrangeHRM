package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Window_TSRTC {
public static void main(String[] args) {
	WebDriver driver;
	String applicationUrlAddress = "https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
    driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Maximize the Browser
	driver.manage().window().maximize();
	
	// Automating Check Availability Element
	// id = "searchBth"
	
	By checkAvailabilityLocator = By.id("searchBth");
	WebElement checkAvailability = driver.findElement(checkAvailabilityLocator);
	System.out.println(" The text of the Button check Availability is :- "+checkAvailabilityLocator);
	checkAvailability.click();
	

}
}
