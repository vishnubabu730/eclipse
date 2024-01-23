package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Titlecomparisonsoft {

	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	 driver=new ChromeDriver();
	 driver.get("https://practicetestautomation.com/practice-test-login/");
				
	}
	//using soft assertion
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String expURL="https://practicetestautomation.com/logged-in-successfully/";
		String actual=driver.getCurrentUrl();
		
		if(expURL.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
