package testng.tutorial;

import org.testng.annotations.Test;

public class LoginTests {

@Test(priority=6)
public void testValidLogin() {
	System.out.println("Validate that the regitered user is able to login with valid credentails");
}
@Test(priority=5)
public void testUnregisteredLogin() {
	System.out.println("Validate that the user gets the correct error message with unregistered email id during login");
	
}
@Test(priority=4)
public void testInvalidCredentailsLogin() {
	System.out.println("Validate that the user gets the correct error message with registered email id and wrong password");
}

@Test(priority=2)
public void testInvalidEmail() {
	System.out.println("Validate that the user gets the correct error message with invalid email format");
}

@Test(priority=1)
public void testBlankEmailPassword() {
	System.out.println("Validate that the user gets the correct error message when keeping email or password blank");
}


}
