package handlingpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyparentBrowser {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://skpatro.github.io/demo/links/");
			Thread.sleep(2000);
			 String wh=driver.getWindowHandle();
			 System.out.println(wh);
			 
	
	}
}
