package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class orangeHRMApplication_Grid {
	
	@Parameters("Browser")
	public void logInTest(String browserName) throws MalformedURLException {
	System.out.println("The Name of the Browser is :-"+browserName);
	DesiredCapabilities cap = null;
	if(browserName.equals("chrome")) {
		cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
	}else {
		
		if
		(browserName.equals("firefox")) {
			//NODE
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		//RemotewebDriver - is use to set client connection b/w the hub and the Node's
	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.88:4444/wd/hub"),cap);
	String ApplicationUrlAddress="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	driver.get(ApplicationUrlAddress);
	
	}
}
}
