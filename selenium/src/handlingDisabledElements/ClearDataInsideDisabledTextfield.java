package handlingDisabledElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDataInsideDisabledTextfield {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./software/chromeDriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/Vani/Desktop/disabledtextfield.html");
    Thread.sleep(2000);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("document.getElementById('a1').value=' '");
    
    
    		
    
    

	}

}
