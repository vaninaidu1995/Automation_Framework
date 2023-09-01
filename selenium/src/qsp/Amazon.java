package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://Amazon.com");
        String title=driver.getTitle();
        System.out.println(title);
       String source=driver.getPageSource();
       
       
       
		

	}

}
