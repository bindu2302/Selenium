import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement helloText = driver.findElement(By.id("finish"));
		helloText.click();
		
		System.out.println("Text after implicit wait: " + helloText.getText());
	}

}
