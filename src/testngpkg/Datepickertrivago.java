package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Datepickertrivago {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.in/en-IN/lm?themeId=280&search=200-64981&sem_keyword=trivago&sem_creativeid=598703244705&sem_matchtype=e&sem_network=g&sem_device=c&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=12420248128&sem_adgroupid=118398954396&sem_targetid=kwd-5593367084&sem_location=9149270&cipc=br&cip=9119000005&gad_source=1&gclid=CjwKCAiAvoqsBhB9EiwA9XTWGf-nq6m2qCLUlXym9SliMPTbyVS3oNdjQUNVVpMbnsVhV0ZicbzK_RoCmPQQAvD_BwE");
		
	}
	
	public void datepiicker()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div[2]/button[12]/time")).click();
		datepickermethod("January 2024","12");
	}

	private void datepickermethod(String expmonth, String expdate) 
	{
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/h3")).getText();
			if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
			}
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div[2]/button/time"));
		for (WebElement datelement:alldates)
		{
			String date=datelement.getText();
			if(date.equals(expdate))
			{
				datelement.click();
				break;
			}
			
		}
		
	}

}
