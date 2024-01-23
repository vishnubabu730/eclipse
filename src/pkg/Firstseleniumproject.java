package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstseleniumproject {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();   //to launch browser
		driver.get("https://www.facebook.com/"); //to launch application using "get"
		String actualtittle=driver.getTitle();  //get the tittle and store it into actualtittle
		System.out.println("title="+actualtittle);
		String expectedtittle="facebook login";      //store expected tittle in a string
		if(actualtittle.equals(expectedtittle))  //check the both string are same
		{
			System.out.println("title are same");
		}
		else
		{
			System.out.println("title are not same");
		}
		
	driver.quit();   //completely close the browser
	}


}
