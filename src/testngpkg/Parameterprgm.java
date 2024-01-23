package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterprgm {
	
	@Parameters({"v"})
	@Test
	public void main(String v)
	
	{
	System.out.println("value of v"+v);	
	}

}
