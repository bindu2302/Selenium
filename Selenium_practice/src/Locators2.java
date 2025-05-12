import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		// LinkText and partialLinktext locators
		// are used to identify elements on webpage by their hyperlink text.
		WebElement bestsellers = driver.findElement(By.linkText("Bestsellers"));
		bestsellers.click();
		
		WebElement todayDeal = driver.findElement(By.partialLinkText("Today's Deals"));
		System.out.println(driver.getCurrentUrl());

	}

}
