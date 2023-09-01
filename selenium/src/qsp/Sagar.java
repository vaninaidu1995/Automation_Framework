package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sagar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://www.facebook.com");
    String title=driver.getTitle();
    System.out.println(title);
    String url=driver.getCurrentUrl();
    System.out.println(url);
    String source=driver.getPageSource();
    System.out.println(source);
    
    
    
	}

}
