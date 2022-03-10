package Selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch1 {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	
	WebDriver drivr = new EdgeDriver();
	drivr.get("https://www.google.com/");
}
}
