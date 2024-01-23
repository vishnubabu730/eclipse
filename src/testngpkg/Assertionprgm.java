package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionprgm {
	
	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
	}
	///soft assertion
	@Test
	public void tittle()
	{
		String exp="google";
		String actual=driver.getTitle();
		
		if (exp.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	System.out.println("hellow world");	
	}
	
	
}
