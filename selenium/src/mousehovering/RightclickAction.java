package mousehovering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickAction {

	public static void main(String[] args) throws InterruptedException {
	
      		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver ();
		    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        	driver.manage().window().maximize();
            Thread.sleep(2000);
             WebElement rclick=driver.findElement(By.xpath("//span[text()='right click me']"));
             Actions act=new Actions(driver);
             act.contextClick(rclick).perform();

	}

}
