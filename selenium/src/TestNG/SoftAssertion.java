package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

		public class SoftAssertion extends generic {
			@Test
			public void test() throws InterruptedException
			{
			 driver.findElement(By.id("email")).sendKeys("vani");
			 driver.findElement(By.name("pass")).sendKeys("1234");
			 driver.findElement(By.name("login")).click();
			 Thread.sleep(2000);
			 String title=driver.getTitle();
			 SoftAssert sa=new SoftAssert();
			 sa.assertEquals(title, "hello");
			 System.out.println("1");
			 sa.assertAll();
			 
			}
			}

	


