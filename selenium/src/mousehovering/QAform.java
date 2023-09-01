package mousehovering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAform {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vani");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("naidu");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("vaninaidu1995@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        
        
        		
        
	}

}
