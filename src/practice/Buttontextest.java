package practice;

import java.sql.Driver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontextest {

	//public static void main(String[] args) {
		ChromeDriver driver;
		
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?ref_id=&vishnubabu730");
			
		}
		
		@Test
		public void textverification()
		{
			String buttontext=driver.findElement(By.xpath("//*[contains(@name,'btnchkavail')]")).getAttribute("value");
		    if(buttontext.equals("Check availability"))
		    {
		    	System.out.println("pass");
		    }
		    else
		    {
		    	System.out.println("fail");
		    }
driver.quit();
	}

}
