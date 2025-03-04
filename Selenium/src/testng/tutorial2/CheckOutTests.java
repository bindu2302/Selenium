package testng.tutorial2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CheckOutTests {
    
	@AfterTest
	public void testCheckOutCreditCard() {
		System.out.println("Validate checkout by valid creditcard");
	}

	@Test
	public void testCheckOutUPI(){
		System.out.println("Validate checkout by valid UPI handle");
	}
	
	@Test
	public void testCheckOutDebitCard(){
		System.out.println("Validate checkout by valid debit card");
	}
	
	@Test
	public void testCheckOutCOD(){
		System.out.println("Validate checkout by CASH ON DELIVERY");
	}
	
	@Test
	public void testCheckOutWallet(){
		System.out.println("Validate checkout by valid wallet");
	}
	
	@Test
	public void testCheckOutPayLater(){
		System.out.println("Validate checkout by pay later mechanism");
	}
	
	@Test
	public void testCheckOutInvalidDebit() {
		System.out.println("Validate checkout by valid debit card");
	}

}
