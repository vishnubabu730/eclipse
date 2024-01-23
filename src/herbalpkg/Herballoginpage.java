package herbalpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Herballoginpage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"top-links\"]/ul/li[1]/a")
	WebElement myaccount;
	
	@FindBy (xpath = "//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")
	WebElement login;
	
	@FindBy (xpath = "//*[@id=\"cont-login-with-email\"]/form/div[1]/input")
	WebElement email;
	
	@FindBy (xpath = "//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
	WebElement password;
	
	@FindBy (xpath = "//*[@id=\"cont-login-with-email\"]/form/button[1]")
	WebElement loginaccount;
	
	
	 public Herballoginpage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this); 
	 }
	public void myaccounttest()
	{
		myaccount.click();
	}
	
	public void loginclck()
	{
		login.click();
	}
	
	public void emailtest(String email1,String paswd)
	{
		email.sendKeys(email1);
	    password.sendKeys(paswd);
	}
	public void logintest()
	{
		loginaccount.click();
	}

}
