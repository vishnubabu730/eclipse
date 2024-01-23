package practice;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationexcercise {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Automation Excercise";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println(actualtitle+"title are same");
		}
		else
		{
			System.out.println("title are not same");
		}
	}
	
	@Test
	public void printlink()
	{
		List<WebElement> linkdetails= driver.findElements(By.tagName("a"));
		System.out.println("total number of links="+linkdetails.size());
	}
	
	@Test
	public void signup()
	{
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("vishnu");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("vishnu730@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		//inside the page
		driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("vishnu123");
		
		//dropdown test
		Select day=new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
		day.selectByVisibleText("1");
		
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
		month.selectByVisibleText("March");
		
		Select year=new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
		year.selectByVisibleText("1999");
		
		
		
		//address information
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
		
		//driver.quit();
	}
}
