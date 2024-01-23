package testpkg;


import org.testng.annotations.Test;


public class Fbcreatetest extends Baseclass
{

	
	@Test
	public void testcreate() throws InterruptedException
	{
	pagepkg.Fbcreatepage ob=new pagepkg.Fbcreatepage(driver);
	Thread.sleep(300);
	ob.cretepageclick();
	ob.titleverification();
	Thread.sleep(300);
	ob.getstartedclick();
	}


}

