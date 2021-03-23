package myContactForm.stepdefs;

import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
import org.junit.Assert;
import myContactForm.pages.BasicContactForm;

public class BasicContactStepDefs {
	
	WebDriver driver;
	BasicContactForm basicContactForm;
	
	@Before
	@Given("I am on the mycontactform webpage")
	public void i_am_on_the_mycontactform_webpage() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		basicContactForm = new BasicContactForm(driver);
		
	}

	@When("I enter {string}, {string}, and {string}")
	public void i_fill_in_the_required_fields_and_click_Submit(String name, String email, String message) {
		
		basicContactForm.getYourNameTextField().sendKeys(name);
		basicContactForm.getEmailAddressTextField().sendKeys(email);
		basicContactForm.getMessageTextField().sendKeys(message);
		basicContactForm.getSubmitButton().click();
	    
	}
	
	@After
	@Then("I should be successfully registered")
	public void i_should_be_successfully_registered() {
		
		String thankYouMessage = driver.findElement(By.xpath("//div[@id = 'center_col']/h4")).getText();
		Assert.assertEquals("Thank You", thankYouMessage);
		
		driver.close();
	}
	


}
