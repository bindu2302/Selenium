import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.kodnest.com/login");

		// css selector is used to find elements in the DOM , it faster than xpath locator, if element not unquely located
		// then it use multiple attributes syntax: tagname[attribute = "value"]
		
		WebElement email = driver.findElement(By.cssSelector("input[name = 'email']"));
		email.sendKeys("naarahimabindu@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[id = 'password-input']"));
		password.sendKeys("Bindu@520");
		WebElement subButton = driver.findElement(By.cssSelector("button[id = 'login-submit-button']"));
		subButton.click();
	}

}
