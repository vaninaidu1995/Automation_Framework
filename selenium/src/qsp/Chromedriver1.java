package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chromedriver1 {

	public static void main(String[] args) {
	    System.setProperty("webdriver.Chrome.driver","./software/Chromedriver.exe");
	    System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		FirefoxDriver driver2= new FirefoxDriver();
				

	}

}
