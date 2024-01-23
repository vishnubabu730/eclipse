package practice;

	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Amazonxpath {
		
		ChromeDriver driver;
		
	@Before

	public void stup()
	{
		driver = new ChromeDriver();
	}

	@Test

	public void test() throws Exception
	{		
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("div[@class='a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox']")).click();
		driver.quit();
	}

	}


