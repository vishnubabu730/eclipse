package practice;

import java.time.Duration;
import java.util.PriorityQueue;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Amazonpracice {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	     driver=new ChromeDriver();
	     driver.get("https://www.amazon.in/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	}
	
	@Test
	public void test1()
	{
		
		driver.get("https://www.amazon.in/s?k=mobiles&crid=3NZF6434VTULT&sprefix=mobiles%2Caps%2C626&ref=nb_sb_noss_1");
		String actualtittle=driver.getTitle();
		String expectedtittle="amazone.in";
		
		if(actualtittle.equalsIgnoreCase(expectedtittle))
		{
			System.out.println(actualtittle);
		}
		else
		{
			System.out.println("title are not match");
		}
	}
	
	@Test
	public void test2()
	{
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=155259812313&hvpone=&hvptwo=&hvadid=678802104413&hvpos=&hvnetw=g&hvrand=17236052578029342736&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007776&hvtargid=kwd-29089120&hydadcr=5496_2412628")).click();
		Set<String>allwindows=driver.getWindowHandles();
		 for(String handle:allwindows)
		 {
			 if(!handle.equalsIgnoreCase(parentwindow))
			 {
				 driver.switchTo().window(handle);
				 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
				 driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
				 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
					driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				 driver.close();
			 }
			 
			 driver.switchTo().window(parentwindow);
		 }
		
	
		
		
	}

}
