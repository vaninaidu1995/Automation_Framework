package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys("vani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys("4568");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button [@value='1']")).click();
		
		
		

	}

}
