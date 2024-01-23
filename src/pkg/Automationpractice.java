package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationpractice {
	ChromeDriver driver;
	
	@Before
	public void setup()
	
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/webpage.html");
		
	}
	@Test
	public void testing()
	
	{
		driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
		Alert a=driver.switchTo().alert();
	    String s=a.getText();
	    a.accept();
	    //a.dismiss();  //in the case of yes or no cases
	    System.out.println(s);
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("ewfw555");
	}

}
