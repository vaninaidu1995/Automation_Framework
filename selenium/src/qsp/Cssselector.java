package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/ChromeDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
			    Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys("vani");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("1234");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
