package BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowsersTesting {
public static void main(String[] args) {
	
	//Automate Chrome Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Thripurareddy\\Java\\DriverFiles\\chromedriver.exe");
	ChromeDriver obj = new ChromeDriver();
	
	//Edge Browser 
	//System.setProperty("webdriver.chrome.driver", " C:\\Users\\dell\\Desktop\\Thripurareddy\\Java");
	//EdgeDriver hi = new EdgeDriver();
	
	
	obj.get("http://bing.com");
	obj.get("http://facebook.com");
	obj.get("http://instagram.com");
	//another Method to open the Url Address
	obj.navigate().to("http://google.com");
	//obj.close();
	obj.quit();
	
}
}
