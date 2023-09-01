package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureTheScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		//step1
		TakesScreenshot ts=(TakesScreenshot)driver;
		//step2
		File src=ts.getScreenshotAs(OutputType.FILE);
		//step3
		File dst=new File("C:\\Users\\Vani\\Desktop\\vani\\popup.jepg");
		//step4
		FileHandler.copy(src, dst);
		
		
		
		
		

	}

}
