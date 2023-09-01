package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Youtube {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.youtube.com");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String abc=driver.getPageSource();
		System.out.println(abc);
		
		
		

	}

}
