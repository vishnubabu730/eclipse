package testpkg;

	import java.time.Duration;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

	public class Baseclass
	{
		public static WebDriver driver;
		
		@BeforeClass  //for seperate window run
		public void beforetest()//loading the browser
		{
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		

	}


