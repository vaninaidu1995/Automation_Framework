package xpath;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		List<WebElement> CBox=driver.findElements(By.xpath("//inpute"));
		int count=CBox.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
		WebElement we=CBox.get(i);
		we.click();
		}
			for(int i=count-1; i>=0; i--)
			{
				WebElement we = CBox.get(i);
			we.click();
			Thread.sleep(2000);
		}
        
	}

}
