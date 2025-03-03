package testng.tutorial;

import org.testng.annotations.Test;

public class LoginTests {

@Test    //--testcase1
public void testValidLogin() {
	System.out.println("Validate that the regitered user is able to login with valid credentails");
}
@Test 
public void testUnregisteredLogin() {
	System.out.println("Validate that the user gets the correct error message with unregistered email id during login");
	
}
@Test 
public void testInvalidCredentailsLogin() {
	System.out.println("Validate that the user gets the correct error message with registered email id and wrong password");
}

@Test //testcase2
public void testInvalidEmail() {
	System.out.println("Validate that the user gets the correct error message with invalid email format");
}

@Test //testcase3
public void testBlankEmailPassword() {
	System.out.println("Validate that the user gets the correct error message when keeping email or password blank");
}


}
