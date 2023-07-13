package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageFactory.GitHub_Login_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import testcases.LoginTest;

public class Loginsteps {

	protected WebDriver driver=null;
	LoginTest lt;
	 
	 
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("remote-allow-origins=*");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		 Thread.sleep(3000);
		 lt = new LoginTest();
		 lt.enterUsername(username);
		 lt.enterPassword(password);
		 

	}

	@And("clicks login button")
	public void clicks_login_button() {
		
			lt.clickOnSignin();
		
	}
}
