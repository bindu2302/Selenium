package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassFillForm {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.kodnest.com/");
			Actions act = new Actions(driver);
			WebElement nameInput = driver.findElement(By.id("form-field-name"));
			act.click(nameInput).sendKeys("Ankit")
			.sendKeys(Keys.TAB)
			.sendKeys("Ankit@kodnest.com")
			.sendKeys(Keys.TAB)
			.sendKeys("9999999999")
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.ENTER)
			.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
			.sendKeys(Keys.ENTER)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
			.sendKeys("kod101")
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.RIGHT)
			.build().perform();


										
	}

}
