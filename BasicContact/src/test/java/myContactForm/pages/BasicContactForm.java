// purpose of this class is to get the required web elements which are part of the contact form
package myContactForm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicContactForm {
	
	WebDriver driver;
	private String url = "https://www.mycontactform.com/samples/basiccontact.php";
	
	public BasicContactForm(WebDriver driver) {	
		this.driver = driver;
		// navigate to the url
		this.driver.get(url);		
	}
	
	// method returns the Name text field web element
	public WebElement getYourNameTextField() {
		return driver.findElement(By.name("q[1]"));
	}
	// method returns the email address text field web element
	public WebElement getEmailAddressTextField() {
		return driver.findElement(By.name("email"));
	}
	// method returns the message text field web element
	public WebElement getMessageTextField() {
		return driver.findElement(By.name("q[2]"));
	}
	// method returns the submit button web element
	public WebElement getSubmitButton() {
		return driver.findElement(By.name("submit"));
	}

}
