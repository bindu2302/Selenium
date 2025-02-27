package webdriverwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
		startButton.click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement welcomeMessage = wait.until(ExpectedConditions.elementToBeClickable(By.id("finish")));  or
		WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		//WebElement welcomeMessage = driver.findElement(By.id("finish"));
		System.out.println(welcomeMessage.getText());
		


	}

}
