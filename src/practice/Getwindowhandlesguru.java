package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Getwindowhandlesguru {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
	}
	
	@Test
	public void testing()
	{
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allwindows=driver.getWindowHandles();
		
		 for(String handle:allwindows)
		 {
			 if(!handle.equalsIgnoreCase(parentwindow))
			 {
				 driver.switchTo().window(handle);
				 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("wfgtufgv");
				 driver.close();
			 }
			 
			 driver.switchTo().window(parentwindow);
			
		 }
		 driver.quit();
	}

}
