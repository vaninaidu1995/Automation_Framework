package mousehovering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(")
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement src=driver.findElement(By.id("box3"));
        WebElement dst=driver.findElement(By.id("box103"));
        Actions.act= new actions(driver);
        act.draganddrop(src.dst).perform();
	}

}
