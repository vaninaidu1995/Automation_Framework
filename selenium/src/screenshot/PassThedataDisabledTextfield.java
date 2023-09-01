package screenshot;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassThedataDisabledTextfield {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Vani/Desktop/disabledtextfield.html");
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.getElementById('a1').value='World'");
			
		

	}

}
