package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouseoverebay {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void testing()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));     //implicit wait it is also dynamc wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));      //explicit wait.in this wait we create an object of wait
		Actions act=new Actions(driver);
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		act.moveToElement(electronics).perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();   //explicit wait
		
		//driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	}
	
	

}
