package testngpkg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassertion {
	
	
	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
	}
	///hard assertion
	@Test
	public void tittle()
	{
		String exp="google";
		String actual=driver.getTitle();
		
	    Assert.assertEquals(actual, exp);  //hard assertion
	    
	    System.out.println("hellow");
	}
}
