package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunnerScript {
	@Test
	public void Click() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Pom1 p1=new Pom1(driver);
		p1.email("vaninaidu1995@gmail.com");
		Thread.sleep(2000);
		p1.password("1234");
		Thread.sleep(2000);
		p1.clickLogin();
		
	}
}
