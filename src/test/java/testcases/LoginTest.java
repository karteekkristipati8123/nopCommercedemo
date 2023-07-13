package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
	@FindBy(id="Email")
	WebElement txt_username;
	
	@FindBy(id="Password")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement btn_signin;
	WebDriver driver;
	public void Logintest(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	 
	public void clickOnSignin() 
	{
		btn_signin.click();
	
	}
	
}
