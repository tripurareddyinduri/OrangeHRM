package com.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
WebDriver driver;
String ApplicationUrlAddress = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
@BeforeTest
public void Setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Thripurareddy\\OrangeHRM_DDT\\Chrome Driver File\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(ApplicationUrlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@Test
public void HelloWorld()
{
	System.out.println("HelloWorld");
}


     @AfterTest
   public void teardown()
   {
	driver.close();
   }   
   
}
