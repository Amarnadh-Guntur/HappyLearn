package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	@Given("^User is on login page$")
   public void User_already_loginpage() {
		System.setProperty("webdriver.chrome.driver", "F:\\Sel4\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://classic.crmpro.com/");
	}
	
	@When("^page title of loginpage is FreeCRM$")
	public void   pagetiltle() {
		String pagetitle =driver.getTitle();
	System.out.println(pagetitle);
	Assert.assertEquals(pagetitle, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}
	
	
	}
