package handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
        driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath(""))
        Thread.sleep(2000);
        driver.findElement(null)
        driver.quit();
	}

}
