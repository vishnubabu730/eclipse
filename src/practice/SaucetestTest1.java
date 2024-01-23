package practice;


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
public class SaucetestTest1 {
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
  public void saucetest() {
    driver.get("https://www.saucedemo.com/v1/");
    driver.manage().window().setSize(new Dimension(1366, 481));
    driver.findElement(By.id("login_credentials")).click();
    driver.findElement(By.id("login_credentials")).click();
    {
      WebElement element = driver.findElement(By.id("login_credentials"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    driver.findElement(By.cssSelector(".login_password")).click();
    driver.findElement(By.cssSelector(".login_password")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".login_password"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .btn_primary")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(3) .btn_primary")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(5) .btn_primary")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(2) .btn_primary")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(4) .btn_primary")).click();
    driver.findElement(By.cssSelector(".btn_primary")).click();
    driver.findElement(By.cssSelector("path")).click();
    driver.findElement(By.linkText("CHECKOUT")).click();
    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).sendKeys("vishnu");
    driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).sendKeys("babu");
    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).sendKeys("686605");
    driver.findElement(By.cssSelector(".btn_primary")).click();
    driver.findElement(By.linkText("FINISH")).click();
    driver.findElement(By.cssSelector(".bm-burger-button > button")).click();
    driver.findElement(By.id("inventory_sidebar_link")).click();
    driver.findElement(By.cssSelector(".bm-burger-button > button")).click();
    driver.findElement(By.id("logout_sidebar_link")).click();
    driver.close();
  }
}
