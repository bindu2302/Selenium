import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class winddowhandles {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/");
		
		// WindowHandles- Retrieves the set of all window handles currently opened
		WebElement pinterestLink = driver.findElement(By.linkText("pinterest"));
		WebElement twitterLink = driver.findElement(By.linkText("twitter"));
		WebElement linkedinLink = driver.findElement(By.linkText("linkedin"));
		WebElement googleLink = driver.findElement(By.linkText("google"));
		WebElement facebookLink = driver.findElement(By.linkText("facebook"));
		
		System.out.println("Hyperlink text: " + pinterestLink.getText());
		pinterestLink.click();
		Thread.sleep(2000);
		
		System.out.println("Hyperlink text: " + twitterLink.getText());
		twitterLink.click();
		Thread.sleep(2000);
		
		System.out.println("Hyperlink text: " + linkedinLink.getText());
		linkedinLink.click();
		Thread.sleep(2000);
		
		System.out.println("Hyperlink text: " + googleLink.getText());
		googleLink.click();
		Thread.sleep(2000);
		
		System.out.println("Hyperlink text: " + facebookLink.getText());
		facebookLink.click();
		Thread.sleep(2000);

		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println("number of wundow handles opens/Tabs: " + windowhandles.size());
		System.out.println("All windows Handles: " + windowhandles);
		
		for(String handle : windowhandles) {
			driver.switchTo().window(handle);
			System.out.println("Switch to : " + driver.getCurrentUrl());
		}
	}
		
//		public static void waitUntilLoad(WebDriver driver) {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			int currentWindow = driver.getWindowHandles().size();
//			wait.until(driver1 -> driver1.getWindowHandles().size() > currentWindow);
//		}
//		
	

}
