package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TestNG.generic;

public class RunnerclassTestng extends generic {
	@Test
	public void test()
	{
driver.findElement(By.id("email")).sendKeys("vani");
driver.findElement(By.name("pass")).sendKeys("1234");
driver.findElement(By.name("login")).click();
	}
	@Test
	public void test2() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("vani");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	 String title=driver.getTitle();
	 System.out.println(title);
	}

}

