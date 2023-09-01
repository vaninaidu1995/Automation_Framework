package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends generic {
@Test
public void test() throws InterruptedException
{
 driver.findElement(By.id("email")).sendKeys("vani");
 driver.findElement(By.name("pass")).sendKeys("1234");
 driver.findElement(By.name("login")).click();
 Thread.sleep(2000);
 String title=driver.getTitle();
 Assert.assertEquals(title, "facebook-login or signup");
 System.out.println("1");
 
}
}
