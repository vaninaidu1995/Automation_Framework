package TestNG;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.thirdparty.publicsuffix.PublicSuffixPatterns;

public class generic {
public WebDriver driver; 
@BeforeMethod
public void openAppln() {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
}
	@AfterMethod
	public void closeappiation()
	{
		driver.close();
	}
	
	
	
}

