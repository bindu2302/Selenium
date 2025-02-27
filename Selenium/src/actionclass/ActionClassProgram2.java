package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassProgram2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/");
		
		WebElement facebook = driver.findElement(By.className("icon_facebook"));
		WebElement google = driver.findElement(By.className("icon_google"));
		WebElement linkedIn = driver.findElement(By.className("icon_linkedIn"));
		WebElement twitter = driver.findElement(By.className("icon_twitter"));
		WebElement pinterest = driver.findElement(By.className("icon_pinterest"));
		
		Actions act = new Actions(driver);
		act.moveToElement(facebook).keyDown(Keys.CONTROL).click().moveToElement(google).click().moveToElement(linkedIn).click().moveToElement(pinterest).click().keyUp(Keys.CONTROL).build().perform();

		
	}
}
