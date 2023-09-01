package PracticeMethod;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
        String title=driver.getTitle();
        System.out.print(title);
        Thread.sleep(2000);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String src=driver.getPageSource();
        System.out.println(src);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.manage().deleteAllCookies();
        Dimension  d=new Dimension(500,500);
        driver.manage().window().setSize(d);
      Dimension P =new P(500,500);
        
        
        
        
        
        
        
        
        
        
        		
