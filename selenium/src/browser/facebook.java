package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("vani");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}

}
