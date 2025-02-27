package webdriverwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		WebElement heading1 = driver.findElement(By.xpath("//div[@class='example']/h3"));
		WebElement heading2 = driver.findElement(By.xpath("//div[@class='example']/h4"));
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
		startButton.click(); // after this loader became visible and then after 5 seconds welcome msg came
		WebElement welcomeMessage = driver.findElement(By.id("finish"));
		System.out.println(welcomeMessage.getText());
		System.out.println(heading1.getText());
		System.out.println(heading2.getText());

	}

}
