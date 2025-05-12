import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kodnest.com/");
		
		WebElement demoButton = driver.findElement(By.xpath("//span[text()='Register for Demo']"));
		Actions act = new Actions(driver);
		act.moveToElement(demoButton).click().perform();
	}

}
