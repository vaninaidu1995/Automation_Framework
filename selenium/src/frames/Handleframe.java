package frames;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
 driver.get("file:///C:/Users/Vani/Desktop/mainpageframe.html");
 driver.findElement(By.xpath(//input[@id='a1']));
		 //Thread.sleep(2000);
		 
  
   
	}

}
