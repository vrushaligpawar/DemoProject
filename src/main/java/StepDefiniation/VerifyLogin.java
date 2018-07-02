package StepDefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyLogin {

	WebDriver driver;
	@Given("^user has valid URL for application$")
	
	public void launchURL()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\chromedriver_win32\\chromedriver.exe");
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		
	}
	
	@When("^User enter UserID and Password$")
	
	public void enterUserIDPassword(CharSequence userID, CharSequence Password)
	{
		driver.findElement(By.id("")).sendKeys(userID);
		driver.findElement(By.id("")).sendKeys(Password);
	}
	
	@Then("^User clicks on Login$")
	
	public void clickLoginbutton()
	{
	driver.findElement(By.id("")).click();
	}
}
