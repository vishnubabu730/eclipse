package testngpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DatePicker {
	ChromeDriver dr;
	String baseURL = "https://www.trivago.com/";
	

	@Test
	public void f() 
	{
		dr.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]")).click();
		datePickerMethod("January 2024", "19");
	}

	public void datePickerMethod(String expMonth, String expDate) 
	{
         while (true)
         {
			String month = dr.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
			System.out.println("month:" + month);
			System.out.println("ExpMonth " + expMonth);
			if (month.equals(expMonth))
			{
				break;
			} 
			else 
			{
				dr.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
			}
		  }
		List<WebElement> dates = dr.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for (WebElement e : dates)
		{
			String date = e.getText();
			if (date.equals(expDate)) 
			{
				System.out.println("date" + date);
				e.click();
				break;
			}
		}
	}

	@BeforeTest
	public void beforeTest() {
		dr = new ChromeDriver();
		
		dr.get(baseURL);

	}

	@AfterTest
	public void afterTest()
	{
		
		dr.quit();
	}

}


