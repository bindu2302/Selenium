package kodnest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import kodnest.pages.LoginPage;

public class KodLoginTests2 {
		WebDriver driver;
		String baseUrl = "https://app.kodnest.in/login";
		LoginPage loginpage;
		
		@BeforeClass
		public void setUp() {
			driver = new ChromeDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
			LoginPage loginpage = new LoginPage(driver); // Initializing LoginPage object
		}
		
		@Test (priority = 1)
		public void testBlankEmailAndPassword() {
			loginpage.clickLoginButton();
			Assert.assertEquals(loginpage.getEmailRequiredError(),"Email is required");
			Assert.assertEquals(loginpage.getPasswordRequiredError(),"Please enter your password");	
		}
		
		@Test (priority = 2) 
		public void testInvalidEmailFormat() {
			loginpage.enterEmail("ankit.com");
			loginpage.clickLoginButton();
			Assert.assertEquals(loginpage.getInvalidEmailFormatError(), "Invalid email format");
		}
		
		
		@Test (priority = 3) 
		public void testUnregisteredEmail()  throws InterruptedException{
			loginpage.enterEmail("uday+ju@kodnest.com");
			loginpage.enterPassword("ankit123");
			loginpage.clickLoginButton();
			Thread.sleep(1000);
			Assert.assertEquals(loginpage.getUserNotFoundError(), "User not found with this email address");
		}
		
		
		@Test (priority = 4) 
		public void testRegisteredEmail() throws InterruptedException {
			loginpage.enterEmail("uday+july@kodnest.com");
			loginpage.enterPassword("ankit123");
			loginpage.clickLoginButton();
			Thread.sleep(1000);
			Assert.assertEquals(loginpage.getIncorrectCredentailsError(), "Incorrect Credentials");
		}
		
		@Test (priority = 5) 
		public void testLoginWithValidCred() {
			loginpage.enterEmail("uday+july@kodnest.com");
			loginpage.enterPassword("ankit123");
			loginpage.clickLoginButton();
			System.out.println("Home page loaded");
		}
		
		
		@AfterMethod
		public void refreshPage() {
			driver.navigate().refresh();
		}
		
}
