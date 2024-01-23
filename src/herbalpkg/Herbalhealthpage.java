package herbalpkg;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Herbalhealthpage {
	
	WebDriver driver;
	
	 @FindBy (xpath = "//*[@id=\"menu\"]/ul/li[2]/a")
	 WebElement healthicon;
	 
	 @FindBy (xpath = "//*[@id=\"input-sort\"]")
	 WebElement dropdown;
	 
	 @FindBy (xpath = "//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
	 WebElement sendenquiries;
	 
	 @FindBy(xpath = "//*[@id=\"Enquiry\"]")
	 WebElement enquiriestype;
	 
	 @FindBy(xpath = "//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	 WebElement sendbutton;
	 
	 public Herbalhealthpage( WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void healthicontest()
	 {
		 healthicon.click();
		 
	 }
	 
	 public void a2ztest()
	 {
		 Select ob=new Select(dropdown);
		 ob.selectByVisibleText("A-Z alphabetical order");
	 }
	 
	 public void sendtest()
	 {
		 sendenquiries.click();
	 }
	 
	 public void enquiriesvalues(String val)
	 {
		 enquiriestype.sendKeys(val);
	 }
	 
	 public void sendclicktest()
	 {
		 sendbutton.click();
	 }
	 

}
