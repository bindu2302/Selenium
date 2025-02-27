package actionclass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassPurpose {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kodnest.com/");
		Actions act = new Actions(driver);
		WebElement registerDemoButton = driver.findElement(By.xpath("//span[text()='Talk to a Career Expert']"));
		act.moveToElement(registerDemoButton).click().build().perform();
	}
}
