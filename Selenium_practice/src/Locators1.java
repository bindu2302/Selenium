import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.kodnest.in/login");
		
	    // WebElement in selenium represents an HTML elements on webpage.HTML elemnts are building blocks of webpage 
		WebElement email = driver.findElement(By.id("email-input"));  // uniquely identify element
		email.sendKeys("naarahimabindu@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password")); // may not be unique, retrives first mathing element, it is used when id attribute is dynamic or unavailable
		password.sendKeys("Bindu@520");
		Thread.sleep(2000);

		
		WebElement loginButton = driver.findElement(By.id("login-submit-button"));
		loginButton.click();
		
		// storing and printing various properties of email input field
		String tagname = email.getTagName();
		String attributeValue = email.getAttribute("name");
		Dimension size = email.getSize();
		System.out.println("width: " + size.width + " height: " + size.height);
		Point location = email.getLocation(); 
		System.out.println("x-axis: " + location.x + ", Y-axis: " + location.y);
		
		
	}
}
