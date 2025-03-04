package testng.tutorial;

import org.testng.annotations.Test;

public class CartTests {

	
@Test    
public void testAddProductsCart() {
	System.out.println("Validate that user is able to add product in the cart");
}	
	
@Test   
public void testIncreaseProductCart() {
	// GET(Homepage)-- click on cart -- then click on + -- then check
	System.out.println("Validate that user is able to increase the product in the cart");
}

@Test    
public void testDecreaseProductCart() {
	System.out.println("Validate that user is able to decrease the product in the cart");
}


@Test
public void testCartTotal() {
	System.out.println("Validate that the cart displays the correct total");
	
}


@Test
public void testProductSaveLaterCart() {
	System.out.println("Validate that the user is able to move the product to save to later section ");
	
}

@Test 
public void testRemoveProductCart() {
	System.out.println("Validate that user is able to remove a product in the cart");
}

@Test  
public void testRetainProductCart() {
	System.out.println("Validate that the cart retains its last state.");
}


}
