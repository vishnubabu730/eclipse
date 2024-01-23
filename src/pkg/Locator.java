package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	ChromeDriver driver;
	@Before
	public void setup()
	{
	     driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     
	}
	
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass32	")).sendKeys("ewfw555");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void close()
	{
	driver.quit();
	}
	
	}


