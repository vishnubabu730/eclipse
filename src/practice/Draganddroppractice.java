package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddroppractice {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	
	@Test
	public void draganddrop()
	{
		Actions act=new Actions(driver);
		WebElement dragamnt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dropamnt=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/div"));
		act.dragAndDrop(dragamnt,dropamnt).perform();
		
		WebElement dragbank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement dropbank=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/div"));
		act.dragAndDrop(dragbank,dropbank).perform();
		
		
		
		
	}
	
	
	
	

}
