

package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonepractice {

ChromeDriver driver;

@BeforeTest

public void Objectcreation()
{
driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@Test

public void Test1()
{
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile Phones");
String title = driver.getTitle();
System.out.println("The title of the current window is : "+ title);


if(title.equals("Amazon.in:mobilephones"))
{
System.out.println("Test pass");
}
else
{
System.out.println("Test Fail");
}
driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

String currentwindow = driver.getWindowHandle();

WebElement one =driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
one.click();


Set<String> allwindows = driver.getWindowHandles();


for(String handle1 : allwindows)
{
if(!handle1.equalsIgnoreCase(currentwindow))
{
driver.switchTo().window(handle1);
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,350)");
driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
JavascriptExecutor js1=(JavascriptExecutor) driver;
js1.executeScript("window.scrollBy(0,350)");
driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
}
}
}

}
