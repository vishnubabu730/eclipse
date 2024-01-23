package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Titlecomparison {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	 driver=new ChromeDriver();
	 driver.get("https://practicetestautomation.com/practice-test-login/");
				
	}
	 // using hard assertion
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String expURL="https://practicetestautomation.com/logged-in-successfully/";
		String actual=driver.getCurrentUrl();
		
		Assert.assertEquals(actual,expURL );  //hard assertion
	}

}
