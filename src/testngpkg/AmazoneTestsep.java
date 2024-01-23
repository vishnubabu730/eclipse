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
public class AmazoneTestsep {
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
  public void amazone() {
    driver.get("https://www.google.co.in/search?q=amazone&sca_esv=596866593&sxsrf=ACQVn0_FAJzwEeL1nD5ej61Vrj445ztdxw%3A1704800319165&source=hp&ei=PzCdZebRB4XkseMPhumrwAY&iflsig=ANes7DEAAAAAZZ0-Tz2JFcKuHNj8A0NheNNVka5YMWH8&oq=amaz&gs_lp=Egdnd3Mtd2l6IgRhbWF6KgIIADIEECMYJzIKECMYgAQYigUYJzIbEC4YgAQYigUYQxixAxiDARjJAxjHARjRAxgKMgsQABiABBiKBRiSAzILEAAYgAQYigUYkgMyEBAAGIAEGBQYhwIYsQMYgwEyCxAAGIAEGLEDGIMBMggQABiABBixAzIFEAAYgAQyBRAAGIAESIkYUABYgAVwAHgAkAEAmAGGBKABuwuqAQkyLTIuMC4xLjG4AQPIAQD4AQHCAhYQLhiABBiKBRhDGLEDGIMBGMcBGNEDwgIKEAAYgAQYigUYQ8ICCBAuGLEDGIAEwgIIEC4YgAQYsQPCAhgQLhiABBiKBRhDGLEDGIMBGMcBGNEDGArCAgsQLhiABBixAxiDAQ&sclient=gws-wiz");
    driver.manage().window().setSize(new Dimension(1366, 481));
    {
      WebElement element = driver.findElement(By.cssSelector(".CCgQ5 > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".CCgQ5 > span")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.xpath("//*[@id=\"sobe_d_b_7_1\"]/a/div/img")).click();
    js.executeScript("window.scrollTo(0,6)");
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector("#sobe_d_b_4_1 .a-dynamic-image")).click();
    driver.findElement(By.cssSelector("#contentGrid_908764 .bxc-grid__row:nth-child(2) img")).click();
    driver.findElement(By.cssSelector("#acs-product-block-0 img")).click();
    driver.findElement(By.cssSelector("#sw-gtc .a-button-text")).click();
    driver.close();
  }
}
