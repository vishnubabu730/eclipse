package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	ChromeDriver driver;

	@Before
	public void setup()
	
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/webpage.html");
	}
	
	@Test
	public void test() throws Exception //throws are provided to "file" testing cases
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //common for taking screenshot-((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
		FileHandler.copy(f, new File("D://screenshot.png"));  //this is common for alltype of copy to file and rename the picture
		
		WebElement button=driver.findElement(By.xpath("//input[@value='Display alert box']")); //common for taking screenshot for a purticular section
		File f1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f1, new File("./screenshot/displaybutton.png"));
	}


	}


