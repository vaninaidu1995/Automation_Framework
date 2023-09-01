package ParallaExec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelexecution {

	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void test1()
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	System.setProperty("webdriver.edge.driver", "./softwares/edgedriver.exe");
	if(browser.equals("edge"))
	{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
	else
	{
		driver=new EdgeDriver();
		driver.get("https://www.google.com");
		
	}
	
	}
}
