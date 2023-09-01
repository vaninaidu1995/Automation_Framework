package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	@FindBy(name="email")
	private WebElement emailtbox;
	@FindBy(name="pass")
	private WebElement pwdtbox;
	@FindBy(xpath="//button[text()='login']")
	private WebElement loginbtn;
	public Pom1(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
   public void email(String email)
   {
	   emailtbox.sendKeys(email);
	   }
public void password(String pass)
{
	pwdtbox.sendKeys(pass);
}
public void clickLogin()
{
	loginbtn.click();
}
		
}


