package pkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Responsecodepgm {

	
		String link="https://www.facebook.com/";
		
		@Test
		
		public void test()
		{
			try
			{
			URL u=new URL(link);
			HttpURLConnection connection=(HttpURLConnection)u.openConnection();
			int code=connection.getResponseCode();
			System.out.println(code);
			if(code==200)
			{
				System.out.println("response code is 200");	
			}
			else
			{
				System.out.println("not 200");
			}
			
			
			
			
			}
			catch(Exception e)
			{
				
			}
		
			
		}
	
		
	

}
