package SeleniumIntroduction.SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);	
	  WebElement email =driver.findElement(By.cssSelector("input[type='text']"));
	  email.sendKeys("Dhananjai"); 
	  WebElement Pass =driver.findElement(By.cssSelector("input[type='password']"));
      Pass.sendKeys("12234");	 
	  WebElement Acc =driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	  Acc.click();
	  WebElement Day = driver.findElement(By.xpath("//select[@name ='birthday_day']"));
	  Day.sendKeys("11");
	  WebElement Year = driver.findElement(By.xpath("//select[@name ='birthday_year']"));
	  Year.sendKeys("1994");
	  WebElement Gender =driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
	  Gender.click();
	}
}

