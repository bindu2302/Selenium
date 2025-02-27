package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.globalsqa.com"); //1
		//driver.findElement(By.className("icon_facebook")).click();
		driver.get("https://www.kodnest.com");
		//driver.findElement(By.xpath("//span[text()='Register for Demo']")).click();
		WebElement registerDemoButton = driver.findElement(By.xpath("//span[text()='Register for Demo']"));
		Thread.sleep(5000);
		registerDemoButton.click();
	}

}
