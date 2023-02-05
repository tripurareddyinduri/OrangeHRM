package com.Google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Valuelabs_HeaderBlock_getText {

	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress = "https://www.valuelabs.com/";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Maximize the Browser
		driver.manage().window().maximize();
		
		 // identify the header block\
		 // id = "navbarSupportedContent"
		 //<button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" 
		 //aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
         // <span class="icon-bar top-bar"></span>
         //  <span class="icon-bar middle-bar"></span>
         //  <span class="icon-bar bottom-bar"></span>
         // </button>
		
		By headerBlockLocator  = By.id("navbarSupportedContent");
		WebElement headerBlock = driver.findElement(headerBlockLocator);
		// identifying the elements of the HeaderBlock
		By headerBlockLinkLocator = By.name("a");
	List<WebElement>headerBlockLinks = headerBlock.findElements(headerBlockLinkLocator);
		for(int index=0; index<headerBlockLinks.size(); index++)
		{
		if(headerBlockLinks.get(index).isDisplayed())	
		{
		String headerBlockLinkName = headerBlockLinks.get(index).getText();	
		System.out.println(headerBlockLinkName);
		}
		}
		driver.quit();
		
	}

}
