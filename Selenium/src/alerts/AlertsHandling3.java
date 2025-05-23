package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		
		Alert promptBox = driver.switchTo().alert();
		promptBox.sendKeys("Selenium with java");
		promptBox.accept();
		
	}

}
