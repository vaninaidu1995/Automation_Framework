package mousehovering;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickonKannadaElement {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
  		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
         driver.get();
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
         Actions act=new Actions(driver);
         Thread.sleep(2000);
         Robot r=new Robot();
         r.keyPress(KeyEvent.VK_T);
         r.keyRelease(KeyEvent.VK_T);
	}
         
}
