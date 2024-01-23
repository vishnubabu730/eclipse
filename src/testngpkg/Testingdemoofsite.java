package testngpkg;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Testingdemoofsite {
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod  //only accomadate url loading of webpage
	public void urlloading()
	{
		driver.get("https://automationexercise.com/login");
	}
	
	@Test(invocationCount = 3)  //invocationcount (used to repeat the test)  //here priority is blank that means this can taken as priority=0,so this will test first
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Automation Excercise";
		if( actualtitle.equals(expectedtitle))
		{
			System.out.println("title are same");
		}
		else
		{
			System.out.println("tite are not same");
		}
		
	}
	
	@Test(priority=1) 
	public void printlink()
	{
		List<WebElement> linkdetails= driver.findElements(By.tagName("a"));
		System.out.println("total number of links="+linkdetails.size());
		
	}
	
	@Test(priority=2)  //priority(used to what we need to test first)
	public void signup()
	{
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("vishnu");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("vishnu@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
	}
	
	@Test(priority=3,dependsOnMethods ="signup")  //dependonmethod(used to depending another test)
	public void insidethepage()
	{
		driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("ewefi");
		
		Select day=new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
		day.selectByVisibleText("1");
		
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
		month.selectByVisibleText("March");
		
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
		year.selectByVisibleText("1999");
		
	}
	
	@Test(priority=4,enabled=false)  //enabled=false(use to disable method)
	public void addressinformation()
	{
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("vishnu");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("babu");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("luminar");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("vishnu home");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("brahmamangalam");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kerala");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("vaikom");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("686605");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("8301993265");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
	
	}
	
	@AfterMethod   //1.run beforemthd 2.run test1 3.run aftermthd , 1.run beforemthd 2.run test2 3.run aftermthd , 1.run beforemthd 2.run test2 3.run aftermthd , last excecute @aftermthd
	public void aftermthd()
	{
		System.out.println("success");
	}
	
	@AfterTest
	public void quiting()
	{
		driver.quit();
	}
	
	

}
