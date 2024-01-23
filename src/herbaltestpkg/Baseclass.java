package herbaltestpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public static WebDriver driver;
	
	@BeforeClass  //for seperate window run
	public void setup()//loading the browser
	{
		driver = new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
