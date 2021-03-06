package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {
     public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement scroll = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", scroll);
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(0, document.body.scrollTop)");
	
}
}
