package POM_script8Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class script {
	@FindBy(id="firstName")
	private WebElement fntbox;
	@FindBy(id="lastName")
	private WebElement lntbox;
	@FindBy(id="userEmail")
	private WebElement uEtbox;
	@FindBy(xpath="//label[text()='Female']")
	private WebElement radiobtn;
	@FindBy(id="userNumber")
	private WebElement mntbox;
	@FindBy(id="subjectsInput")
	private WebElement subtbox;
	@FindBy(xpath="//label[text()='Reading']")
	private WebElement radiobtnn;
	public script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	public void firstName(String firstName)
	   {
		fntbox.sendKeys(firstName);
		   }
	public void lastName(String lastName )
	   {
		lntbox.sendKeys(lastName);
		   }
	public void userEmail(String userEmail )
	   {
		uEtbox.sendKeys(userEmail);
		   }
	public void radiobutton()
	   {
		radiobtn.click();
		   }
	public void userNumber(String userNumber)
	   {
		mntbox.sendKeys(userNumber);
	   }
	public void subjectsInput(String subjectsInput)
	   {
		subtbox.sendKeys(subjectsInput);
	   }
	public void reading()
	   {
		radiobtnn.click();
	   }
	
	
	
}
