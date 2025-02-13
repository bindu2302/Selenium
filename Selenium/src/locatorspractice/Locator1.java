package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.kodnest.in/login");
		driver.manage().window().maximize();
		
		
		WebElement emailAddressField = driver.findElement(By.id("email-input"));
		emailAddressField.sendKeys("naarahimabindu@gmail.com");
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Bindu@520");
		
		WebElement loginButton = driver.findElement(By.id("login-submit-button"));
		loginButton.click();
		
		WebElement joinClassButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div[3]/div/button[2]/svg"));
		boolean frontEndEnableCheck = joinClassButton.isEnabled();
		System.out.println(frontEndEnableCheck);

//		driver.findElement(By.className(""));
//		driver.findElement(By.cssSelector(""));
//		driver.findElement(By.linkText(""));
//		driver.findElement(By.name("email"));
//		driver.findElement(By.partialLinkText(""));
//		driver.findElement(By.tagName(""));
//		driver.findElement(By.xpath(""));


	}

}
