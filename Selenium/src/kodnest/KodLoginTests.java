package kodnest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KodLoginTests  {
		WebDriver driver;
		String baseUrl = "https://app.kodnest.in/login";
		
		@BeforeClass
		public void setUp() {
			driver = new ChromeDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
		}
		
		@Test (priority = 1)
		public void testBlankEmailAndPassword() {
			driver.findElement(By.id("login-submit-button")).click();
			String actualEmailError = driver.findElement(By.xpath("//p[@id='email-error' and text() = 'Email is required']")).getText();
			String actualPasswordError = driver.findElement(By.xpath("//p[@id='password-error'  and text() = 'Please enter your password']")).getText();
			
			Assert.assertEquals(actualEmailError,"Email is required");
			Assert.assertEquals(actualPasswordError,"Please enter your password");	
		}
		
		@Test (priority = 2) 
		public void testInvalidEmailFormat() {
			WebElement emailField = driver.findElement(By.id("email-input"));
			emailField.sendKeys("ankit.com");
			driver.findElement(By.id("login-submit-button")).click();
			
			String actualInvalidEmailError = driver.findElement(By.xpath("//p[@id='email-error' and text() = 'Invalid email format']")).getText();
			Assert.assertEquals(actualInvalidEmailError, "Invalid email format");
		}
		
		
		@Test (priority = 3) 
		public void testUnregisteredEmail()  throws InterruptedException{
			driver.findElement(By.id("email-input")).sendKeys("uday+ju@kodnest.com");
			driver.findElement(By.id("password-input")).sendKeys("ankit123");
			driver.findElement(By.id("login-submit-button")).click();
			Thread.sleep(2000);
			String actualUserNotFoundMsg = driver.findElement(By.xpath("//div[@data-title= '' and text() = 'User not found with this email address']")).getText();
			Assert.assertEquals(actualUserNotFoundMsg, "User not found with this email address");
		}
		
		
		@Test (priority = 4) 
		public void testRegisteredEmail() throws InterruptedException {
			driver.findElement(By.id("email-input")).sendKeys("uday+julyA1@kodnest.com");
			driver.findElement(By.id("password-input")).sendKeys("ankit123");
			driver.findElement(By.id("login-submit-button")).click();
			Thread.sleep(1000);

			String actualIncorrectCredentialsMsg = driver.findElement(By.xpath("//div[@data-title= '' and text() = 'Incorrect Credentials']")).getText();
			Assert.assertEquals(actualIncorrectCredentialsMsg, "Incorrect Credentials");
		}
		
		@Test (priority = 5) 
		public void testLoginWithValidCred() {
			driver.findElement(By.id("email-input")).sendKeys("uday+julyA1@kodnest.com");
			driver.findElement(By.id("password-input")).sendKeys("ankit123");
			driver.findElement(By.id("login-submit-button")).click();
			System.out.println("Home page loaded");
		}
		
		
		@AfterMethod
		public void refreshPage() {
			driver.navigate().refresh();
		}
		
}
