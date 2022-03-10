package Selenium_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//WebElement a = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		//a.click();
		//Alert a1 = driver.switchTo().alert();
		//Thread.sleep(2000);
		//a1.accept();
		
		//WebElement b = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		//b.click();
		//WebElement b1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		//Alert b2 = driver.switchTo().alert();
		//b2.dismiss();
		
		WebElement c = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		c.click();
		WebElement c1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		c1.click();
		Thread.sleep(2000);
		Alert c2 = driver.switchTo().alert();
		c2.sendKeys("Keerthi");
		c2.accept();

		
		
		//WebElement ca = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		//ca.click();
		//Thread.sleep(2000);
		
		//WebElement fn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		//fn.sendKeys("Keerthi");
		
		//WebElement sn = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		//sn.sendKeys("Varman");
		
		//WebElement mn = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		//mn.sendKeys("8667816242");
		
		//WebElement np = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		//np.sendKeys("Driver@12334");
		
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		
		//String title = driver.getTitle();
		//System.out.println(title);
		//Thread.sleep(3000);
		
		//driver.navigate().to("https://www.flipkart.com");
		
		//String currentUrl2 = driver.getCurrentUrl();
		//System.out.println(currentUrl2);
		
		//String title2 = driver.getTitle();
		//System.out.println(title2);
		//Thread.sleep(6000);
	
		//driver.navigate().back();
		
		//WebElement e = driver.findElement(By.name("email"));
		//e.sendKeys("keerthizzzzz@yahoo.co.in");
		
		//WebElement p = driver.findElement(By.id("pass"));
		//p.sendKeys("Password_123");
		//WebElement l = driver.findElement(By.name("login"));
		//l.click();
		
		//driver.quit();
		
	}

}
