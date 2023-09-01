package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
	    WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
	    WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
	    WebElement ele3 = driver.findElement(By.xpath("//span[text()='Projects']"));
	    WebElement ele4 = driver.findElement(By.xpath("//span[text()='Support']"));
	    WebElement ele5 = driver.findElement(By.xpath("//span[text()='Blog']"));
	    ArrayList<WebElement> l=new ArrayList<WebElement>();
	    l.add(ele1);
	    l.add(ele2);
	    l.add(ele3);
	    l.add(ele4);
	    l.add(ele5);
	    Actions a=new Actions(driver);
	    Robot r=new Robot();
	    for(WebElement we:l) {
	    	a.contextClick(we).perform();
	    	Thread.sleep(2000);
	    	r.keyPress(KeyEvent.VK_T);
	    	r.keyRelease(KeyEvent.VK_T);
	    }
	    Set<String> allwh = driver.getWindowHandles();
	    ArrayList<String> l1=new ArrayList<String>(allwh);
	    for(String wh:allwh) {
	    	String rv=l1.get(4);
	    	driver.switchTo().window(rv);
	    }
	    
	    
	    
	}
		
		
	}
	


