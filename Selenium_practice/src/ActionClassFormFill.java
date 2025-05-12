import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassFormFill {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kodnest.com/");
		
		WebElement namefield = driver.findElement(By.id("form-field-name"));
		
		Actions act = new Actions(driver);
		act.click(namefield)
			.sendKeys("Ankit")
			.sendKeys(Keys.TAB)
			.sendKeys("ankit@gmail.com")
			.sendKeys(Keys.TAB)
			.sendKeys("888888888")
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.ENTER)
			.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
			.sendKeys(Keys.ENTER)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.ENTER)
			.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
			.sendKeys(Keys.ENTER)
			.sendKeys(Keys.TAB)
			.sendKeys("Kod123")
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.RIGHT)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.ENTER)
			.perform();
	}

}
