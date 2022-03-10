package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805943%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=550525805943&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiA95aRBhCsARIsAC2xvfzHuCiTtmg7dG0Ckjte_5yU02c0Hctkv1iE7OewHJM1RbLOWR1WMtoaAu-FEALw_wcB");
		driver.manage().window().maximize();
		
		WebElement fn = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fn.sendKeys("Keerthi");		
		WebElement sn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		sn.sendKeys("Varman");
		WebElement mn = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		mn.sendKeys("8667816242");
		WebElement np = driver.findElement(By.xpath("//input[@type='password']"));
		np.sendKeys("Driver@12334");
		
		//Drop_Down
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s = new Select(day);
		s.selectByValue("15");
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Aug");
		WebElement yr = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select s2 = new Select(yr);
		s2.selectByValue("1947");
		
		//driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		

	}

}
