package testng.tutorial;

import org.testng.annotations.Test;

public class LoginTests2 {

@Test(priority=5)
public void regression_ValidLogin() {
	System.out.println("Validate that the regitered user is able to login with valid credentails");
}
@Test(priority=3)
public void regression_UnregisteredLogin() {
	System.out.println("Validate that the user gets the correct error message with unregistered email id during login");
	
}
@Test(priority=4)
public void regression_UpdateProfile() {
	System.out.println("Validate that user is able to update the profile.");
}

@Test(priority=2)
public void smoke_HomePageLoad() {
	System.out.println("Validate that the user to the homepage with valid credentials and home page loads.");
}

@Test(priority=1)
public void smoke_CreateAccount() {
	System.out.println("Validate that the user able to create account with uregistered and valid mail ID");
}
}
