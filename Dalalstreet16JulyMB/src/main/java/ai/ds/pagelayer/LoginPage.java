package ai.ds.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------- Obj repo ----------------------
	@FindBy(xpath="//input[@name='email']")
	private WebElement txtbox_email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement txtbox_password;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement btn_login;
	
	//--------- Action methods ----------------
	
	public void enterEmailID(String email)
	{
		txtbox_email.sendKeys(email);
	}
	
	public void enterPassword(String pass)
	{
		txtbox_password.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		btn_login.click();
	}
	
	public String getActualUrl()
	{
		String curl =driver.getCurrentUrl();
		return curl;
	}

}
