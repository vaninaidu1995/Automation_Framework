package handlingDisabledElements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();77
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
       Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("womens tops");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
       
        Set<String> allwh = driver.getWindowHandles();
      ArrayList<String> l=new ArrayList<String>(allwh);
       for (String wh : allwh) {
    	  String b1 = l.get(0);
		driver.switchTo().window(b1);
	}
       driver.findElement(By.xpath("(//span[contains(text(),'Short-Sleeve')])[1]")).click();
       
       Set<String> allwh1 = driver.getWindowHandles();
     ArrayList<String> l1=new ArrayList<String>(allwh1);
      for (String wh1 : allwh1) {
   	  String b2 = l1.get(0);
		driver.switchTo().window(b2);
	}
      driver.findElement(By.id("buy-now-button")).click();
      Thread.sleep(2000);
      
      TakesScreenshot ts=(TakesScreenshot) driver;
      File src = ts.getScreenshotAs(OutputType.FILE);
      File dst = new File("C:\\Users\\Vani\\Desktop\\vani\\amazon.jpeg");
      FileHandler.copy(src, dst);
     
      
        
        
			}

}
