package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		ChromeDriver object=new ChromeDriver();
		object.get("https://www.youtube.com/");
		String actualname=object.getTitle();
		String expectedname="youtube";
		System.out.println(object.getTitle());
		if(actualname.equals(expectedname))
		{
			System.out.println("both are same name");
		}
		else
		{
			System.out.println("both are different name");
		}
		object.close();
	}

}
