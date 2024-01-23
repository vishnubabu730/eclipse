package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	    @Before
	    public void setup()
	    {
	    	driver=new ChromeDriver();
	    	driver.get("https://www.google.co.in/");
	    }
	    
	    @Test
	    public void titleverification()
	    {
	    	String actualtitle=driver.getTitle();
	    	System.out.println("title "+actualtitle);
	    	String expectedtitle="google.com";
	    	
	    	if(expectedtitle.equals(actualtitle))
	    	{
	    		System.out.println("title are same");
	    	}
	    	else
	    	{
	    		System.out.println("title are not same");
	    	}
	    	
	    }
	    
	    @Test
	    public void pagesourse()
	    {
	    	String sourse= driver.getPageSource();
	    	
	    	if(sourse.contains("Gmail"))
	    	{
	    		System.out.println("present");
	    	}
	    	else
	    	{
	    		System.out.println("not present");
	    	}
	    }
	    
	    @After
	    public void teardown()
	    {
	    	driver.quit();
	    }
	

	}


