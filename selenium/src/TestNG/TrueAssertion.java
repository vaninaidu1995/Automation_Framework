package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrueAssertion {
	public class Assertion extends generic {
		@Test
		public void test() throws InterruptedException
		{
		 driver.findElement(By.id("email")).sendKeys("vani");
		 driver.findElement(By.name("pass")).sendKeys("1234");
		 driver.findElement(By.name("login")).click();
		 Thread.sleep(2000);
		 String title=driver.getTitle();
		 Assert.assertTrue(title.contains("Facebook"));
		 System.out.println("1");
		 
		}
		}

}
