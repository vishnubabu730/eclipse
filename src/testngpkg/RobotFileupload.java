package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotFileupload {
	
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
	
     Fileupload("C:\\Users\\dell\\Documents\\Custom Office Templates\\tutorial ninja defect report.xlsx");   //creating an object for file uploading
	}

	private void Fileupload(String p) throws AWTException 
	{
		StringSelection strselection= new StringSelection(p);   //create object and storing file uploading to p
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);  //copying to clipboard
		
		Robot robot=new Robot();
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(3000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(4000);
		
		
	}	
	
	

}
