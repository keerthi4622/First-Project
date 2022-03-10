package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("SingleFrame");
		WebElement text1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text1.sendKeys("Keerthi");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(frame1);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("KeerthiVarman");
		
		

}
}
