package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngpracticefacebook {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	    driver=new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	}
	@Parameters({"v","p"})
	
	@Test
	public void main(String v,String p )
	{
		System.out.println(v);
		System.out.println(p);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(v);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(p);
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
	}
	
	@AfterMethod
	public void mthd()
	{
		System.out.println("success");
	}
	
	@AfterTest
	public void quitting()
	{
		driver.quit();
	}
	
	
	
	

}
