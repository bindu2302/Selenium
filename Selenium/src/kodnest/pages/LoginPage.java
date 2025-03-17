package kodnest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver1) {
		this.driver = driver1;
	}
	
	By emailInput = By.id("email-input");
	By passwordInput = By.id("password-input");
	By loginButton = By.id("login-submit-button");
	By emailRequiredError = By.xpath("p[@id='email-error' and text() = 'Email is required']");
	By passwordRequiredError = By.xpath("//p[@id='password-error'  and text() = 'Please enter your password']");
	By userNotFoundError = By.xpath("//div[@data-title= '' and text() = 'User not found with this email address']");
	By invalidEmailFormatError = By.xpath("//p[@id='email-error' and text() = 'Invalid email format']");
	By incorrectCredentailsError = By.xpath("//div[@data-title= '' and text() = 'Incorrect Credentials']");

	
	public void enterEmail(String email) {
		WebElement emailField = driver.findElement(emailInput);
		emailField.clear();
		emailField.sendKeys(email);
	}
	
	
	public void enterPassword(String password) {
		WebElement passwordField = driver.findElement(passwordInput);
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public String getEmailRequiredError() {
		return driver.findElement(emailRequiredError).getText();
	}
	
	public String getPasswordRequiredError() {
		return driver.findElement(passwordRequiredError).getText();
	}
	
	public String getUserNotFoundError() {
		return driver.findElement(userNotFoundError).getText();
	}
	
	public String getInvalidEmailFormatError() {
		return driver.findElement(invalidEmailFormatError).getText();
	}
	
	public String getIncorrectCredentailsError(){
		return driver.findElement(incorrectCredentailsError).getText();
	}
}
