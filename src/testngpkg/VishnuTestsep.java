package testngpkg;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class VishnuTestsep {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void vishnu() {
    driver.get("https://www.google.co.in/search?q=books&sca_esv=596866593&sxsrf=ACQVn08xu2cQeZHQb96DIPiezwvubcCudQ%3A1704799877780&source=hp&ei=hS6dZazwLKrk2roPg760wAg&iflsig=ANes7DEAAAAAZZ08lZmcLqUAD4Cw0Kh0nD2CMM_ImVzC&ved=0ahUKEwjsxoC5mtCDAxUqslYBHQMfDYgQ4dUDCAo&uact=5&oq=books&gs_lp=Egdnd3Mtd2l6IgVib29rczIKECMYgAQYigUYJzIQEAAYgAQYigUYQxixAxiDATIQEAAYgAQYigUYQxixAxiDATINEAAYgAQYigUYQxixAzIKEAAYgAQYigUYQzIQEC4YgAQYigUYQxjHARjRAzIIEAAYgAQYsQMyERAuGIAEGLEDGIMBGMcBGK8BMg4QABiABBixAxiDARjJAzILEAAYgAQYigUYkgNIqg9QAFjjBnAAeACQAQCYAZ4BoAG2BKoBAzEuNLgBA8gBAPgBAQ&sclient=gws-wiz");
    driver.manage().window().setSize(new Dimension(1366, 481));
    {
      WebElement element = driver.findElement(By.cssSelector("#rso > .MjjYud:nth-child(1) .LC20lb"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector(".ExCKkf > svg")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#rso > .MjjYud:nth-child(1) .LC20lb"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.close();
  }
}
