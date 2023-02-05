package com.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_findinglinks {
public static void main(String[] args) {
	WebDriver driver;
	String applicationUrlAddress = "https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	
	// <a class="selectedtabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
	// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="HomeHome</a>
	// <a class="selectedtabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
	
	
	// Common Property among the links of the WebPage is - an anchor Tag
	By linksTagL = By.tagName("a");
	
	// since Multiple elements are found and store - its a List
	// since elements are found - its List of WebElement - ArrayList of Java
	
	List<WebElement>TSRTC_HomePageLinks = driver.findElements(linksTagL);
	
	int TSRTC_HomePageLinks_Count = TSRTC_HomePageLinks.size();
	// size if arrayList
	System.out.println("The Number of links on the TSRTC Application HomePage are :-" + TSRTC_HomePageLinks_Count);
	
	for(int index = 0; index<TSRTC_HomePageLinks.size(); index++) {
		// To goto all the index's of Array
		// Going to every index of an Array List and getting the text of it - link Name
		String linkName = TSRTC_HomePageLinks.get(index).getText();
		System.out.println(index+" "+linkName);
		// getting the link Name
	}
	
}
}
