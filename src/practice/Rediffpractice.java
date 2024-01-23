package practice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffpractice {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
	     driver=new ChromeDriver();
	     driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	     
	}
	
	@Test
	 public void tesing()
	 {
		if (driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is no displayed");
		}
		
		if(driver.findElement(By.id("Register")).isEnabled())
		{
	      System.out.println("icon is enabled");
		}
        else
        {
	        {
		       System.out.println("icon is not enabled");
	        }
        }

           driver.quit();

	 }
	
	
	
}
