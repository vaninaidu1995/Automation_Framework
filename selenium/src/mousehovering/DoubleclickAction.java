package mousehovering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();
	WebElement dclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act=new Actions(driver);
	act.doubleClick(dclick).perform();
	
	}
			
}