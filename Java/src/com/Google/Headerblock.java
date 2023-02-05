package com.Google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headerblock {
public static void main(String[] args) {
	WebDriver driver;
	String applicationUrlAddress = "https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Maximize the Browser
	driver.manage().window().maximize();
	
	// Identifying the Header Block of TSRTC Appalication
	// Class = "menu-wrap"
	By tsrtc_HeaderBlockL = By.className("menu-wrap");
	WebElement tsrtc_HeaderBlock = driver.findElement(tsrtc_HeaderBlockL);
	
	// Type of Elements in the Header Block are - link
	//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
	//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
	//<a class="selectedtabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>

	By HeaderBlockElementsLocator = By.tagName("a");
	// Going to the headerBlock and finding the elements of the headerblock wich are of type link
	List<WebElement> headerBlockLinks = tsrtc_HeaderBlock.findElements(HeaderBlockElementsLocator);
	
	int headerBlockLinks_Count = headerBlockLinks.size();
	System.out.println(" The number of elements of type links in the header block of TSRTC Application Home Page are :- "+ headerBlockLinks_Count);
	
	// getting the elements names of the Header Block
	
	for(int index=0; index<headerBlockLinks_Count; index++) {
		String headerBlock_LinkName = headerBlockLinks.get(index).getText();
		System.out.println(index+" "+headerBlock_LinkName);
	}
	
	
	
	//driver.quit();
	//driver.close();
	

}

}
