package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thred.sleep(2000);
	driver.findElement(By.linkText(null))
	

	}

}
