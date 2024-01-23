package practice;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newsitepractice {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void page()
	{
       Actions act=new Actions(driver);
		 WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		 act.contextClick(rightclick).perform();    //act.contextclick is used for right click
		 
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		
		
		Alert a=driver.switchTo().alert();     //for switching from driver to alert
		String alerttext=a.getText();
		a.accept();
		System.out.println(alerttext);
		
		
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick).perform();   //act.doubleClick used for double click
		
		Alert a1=driver.switchTo().alert();   //to switch from one section to another section
		String alerttext1=a1.getText();
		a1.accept();     
		System.out.println(alerttext1);
		
	}
	

}
