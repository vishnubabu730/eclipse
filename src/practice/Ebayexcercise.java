package practice;


	
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Ebayexcercise {
	
		ChromeDriver driver;
		
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
		}
		@Test
		public void ebay()

		{
			driver.get("https://www.ebay.com");
			String actualtitle=driver.getTitle();
			System.out.println("title="+actualtitle);
			
			String title="Ebay.com";
		
			
			if(actualtitle.equalsIgnoreCase(title))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			driver.findElement(By.xpath("//*[@id='gh-shop-ei']")).click();
			driver.findElement(By.xpath("//ul/li[4]/a[@class='scnd']")).click();
			String s="Shop by category";
			if(driver.getPageSource().contains(s))
			{
				System.out.println(s+"is present");
				
			}
			else
			{
				System.out.println(s+"is not present");
			}
			
			driver.findElement(By.xpath("//*[@class='b-img']")).click();
		
			
			
			driver.findElement(By.xpath("//*[@id='gh-minicart-hover']/div/a[1]/*[@class='gh-cart-icon']")).click();
			driver.findElement(By.xpath("//*[@class='actions multi-actions']/a[2]")).click();
			driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("books",Keys.ENTER);;
		}
		

	}



