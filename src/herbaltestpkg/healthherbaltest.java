package herbaltestpkg;

import org.testng.annotations.Test;

import herbalpkg.Herbalhealthpage;

public class healthherbaltest extends Baseclass {
	
	@Test
	public void healthherbaltestcreate() throws InterruptedException
	{
		Herbalhealthpage ob=new Herbalhealthpage(driver);
		ob.healthicontest();
		Thread.sleep(300);
		ob.a2ztest();
		Thread.sleep(300);
		ob.sendtest();
		ob.enquiriesvalues("thanks");
		Thread.sleep(300);
		ob.sendclicktest();
	}

}
