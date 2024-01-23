package pagepkg;

 
	
	import org.junit.Assert;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Fbcreatepage
	{
		WebDriver driver;
		
	    @FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	    WebElement createpage;
	    @FindBy(xpath="//*[@id=\"headerInnerContainer\"]/div[1]")
	    WebElement title;
	    @FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
	    WebElement getstarted;
	    
	    public Fbcreatepage(WebDriver driver)
	    {
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void titleverification()
	    {
        	String actualtitle=driver.getTitle();
        	Assert.assertEquals("createpage", actualtitle);
	    }
	    
	    public void cretepageclick()
	    {
	    	createpage.click();
	    }
	    
	    public void getstartedclick()
	    {
	    	getstarted.click();
	    }
	    
	   
	


}
