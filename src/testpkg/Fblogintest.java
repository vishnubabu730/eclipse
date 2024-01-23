package testpkg;


import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Fblogintest extends Baseclass
{

	@Test
	public void testlogin()//refering the values entered
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("vishnu", "vishnu2222");
		ob.login();
		driver.navigate().back();//runs in two diffrent windows
	}

}


