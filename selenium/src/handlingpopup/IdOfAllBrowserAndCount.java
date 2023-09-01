package handlingpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class IdOfAllBrowserAndCount {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	driver.findElement(By.name("NewWindow")).click();
	Thread.sleep(4000);
	Set<String> allwh = driver.getWindowHandles();
	int count=allwh.size();
	System.out.println(count);
	for(String wh:allwh)
	{
		System.out.println(wh);
	}
		
}
}