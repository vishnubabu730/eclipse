package herbaltestpkg;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import herbalpkg.Herballoginpage;

public class herballogintest extends Baseclass{
	@Test
	public void testcreate() throws InterruptedException
	{
	  Herballoginpage ob=new Herballoginpage(driver);
	  ob.myaccounttest();
	  Thread.sleep(1000);
	  ob.loginclck();
	  
	  Thread.sleep(2000);
	  ob.emailtest("vishnubabu730@gmail.com", "Vishnu@007");
	  Thread.sleep(300);
	  ob.logintest();

	  
	 
	}

}
