package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	      driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void signup() throws IOException, InterruptedException
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\dell\\Desktop\\signup.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi); //return workbook details
		XSSFSheet sh=wb.getSheet("Sheet1"); //return sheet details
		int rowcount=sh.getLastRowNum();  //return row count
		
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue(); //get the row,column and the values of username fields
			System.out.println("username"+username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();  //get the row,column and the values of password fields
			System.out.println("password"+password);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			Thread.sleep(3000);
		}
	}

}
