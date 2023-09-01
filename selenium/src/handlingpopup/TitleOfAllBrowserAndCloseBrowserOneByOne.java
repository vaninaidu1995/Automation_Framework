package handlingpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfAllBrowserAndCloseBrowserOneByOne {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver","./software/chrome.driver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("newwindow")).click();
		Thread.sleep(4000);
		Set<String> allwh = driver.getWindowHandles();
	     int count=allwh.size();
	     System.out.println(count);
	     for(String wh:allwh)
	     driver.switchTo().window(wh);
	     String title=driver.getTitle();
	     System.out.println(title);
	     Thread.sleep(2000);
	     driver.close();
	}

}
