package generic;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Date;
import java.util.logging.FileHandler;

import javax.xml.crypto.Data;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_Photo {

	public static void getphoto(WebDriver driver) {
		String photo="./photos/";
		Date d= new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":", "_t");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("photo+d2+.jpeg");
		FileHandler.copy(src.dst);
		
		
		
		
		
	}
}