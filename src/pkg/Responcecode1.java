package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responcecode1 {

	//public static void main(String[] args) {
		
	//}

	ChromeDriver driver;
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/search?q=intagram&rlz=1C1GCEJ_enIN1072IN1072&oq=intagram&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQRRhAMg8IAhAAGAoYgwEYsQMYgAQyDwgDEAAYChiDARixAxiABDIPCAQQABgKGIMBGLEDGIAEMgkIBRAAGAoYgAQyDwgGEAAYChiDARixAxiABDIGCAcQBRhA0gEIMjcwM2owajSoAgCwAgA&sourceid=chrome&ie=UTF-8");
	}
	
	@Test
	public void titleverification() throws Exception
	{
		List<WebElement> linkdetails= driver.findElements(By.tagName("a"));
		System.out.println("total number of links="+linkdetails.size());
		
		for (WebElement element :linkdetails)
		{
			String link=element.getAttribute("href");
			verify (link);
		}
		driver.quit();

	
		
	}

	private void verify(String link) {
		try
		{
		URL u=new URL(link);
	    HttpURLConnection connection=(HttpURLConnection)u.openConnection();
	    int code=connection.getResponseCode();
	    System.out.println(code);
	    if(code==200)
	    {
	    	System.out.println("response code is 200--"+link);
	    }
	    	else if(code==400)
	    	{
	    		System.out.println("response code is--"+link);
	    		
	    	}
	    	else
	    	{
	    		System.out.println("other codes link--"+link);
	    	}
	    
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
