package Selenium_1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Multi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement single = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		single.click();
		Thread.sleep(2000);
		Select s3 = new Select(single);
		s3.selectByIndex(1);
		WebElement single1 = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
		single1.click();
		Thread.sleep(2000);
		Select s4 = new Select(single1);
		s4.selectByValue("avatar");
		WebElement mul = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
		Select s5 = new Select(mul);
		boolean multiple = s5.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = s5.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}
		//s5.selectByValue("burger");
		//s5.selectByValue("bonda");
		int size = options.size();
		System.out.println(size);
		
		for (int i = 1; i < size; i++) {
			if(i==1 || i==3) {
				s5.selectByIndex(i);
			}
			
		}
		
	}

}
