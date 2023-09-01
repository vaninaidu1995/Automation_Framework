package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
	     driver.findElement(By.id("email")).sendKeys("vani");
	     Thread.sleep(2000);
	    driver.findElement(By.name("pass")).sendKeys("1234");
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginbutton")).clic
        
        
       
        
        

	}
}
