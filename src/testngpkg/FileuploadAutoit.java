package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadAutoit {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	
	}
	
	@Test
	public void fileuploadprgm() throws Exception
	{
		driver.get("https://www.ilovepdf.com/excel_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\dell\\Documents\\Custom Office Templates\\autoIt.exe");
		Thread.sleep(3000);
	}
}
