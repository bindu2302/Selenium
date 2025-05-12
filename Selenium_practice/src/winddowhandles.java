import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class winddowhandles {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/");
		Thread.sleep(2000);

		driver.findElement(By.className("header_soc_pinterest")).click();
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);
		
		driver.findElement(By.className("header_soc_twitter")).click();
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);
		
		driver.findElement(By.className("header_soc_linkedin")).click();
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);
		
		driver.findElement(By.className("header_soc_google")).click();
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);
		
		driver.findElement(By.className("header_soc_facebook")).click();
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);
		
		Set<String> currentHandles = driver.getWindowHandles();
		System.out.println(currentHandles);
		
		Iterator<String> iterator = currentHandles.iterator();
		
		String mainWindow = iterator.next();
		String pinterestHandle = iterator.next();
		String twitterHandle = iterator.next();
		String linkedinHandle = iterator.next();
		String googleHandle = iterator.next();
		String facebookHandle = iterator.next();
		
		System.out.println("Main window handle: " + mainWindow);
		System.out.println("Pinterest window: " + pinterestHandle);
		System.out.println("Twitter window: " + twitterHandle);
		System.out.println("LinkedIn window: " + linkedinHandle);
		System.out.println("Google window: " + googleHandle);
		System.out.println("Facebook window: " + facebookHandle);
		
		driver.switchTo().window(pinterestHandle);
		System.out.println("Pinterest page title: " + driver.getTitle());
		
		driver.switchTo().window(twitterHandle);
		System.out.println("Twitter page title: " + driver.getTitle());
		
		driver.switchTo().window(linkedinHandle);
		System.out.println("Linkedin page title: " + driver.getTitle());
		
		driver.switchTo().window(googleHandle);
		System.out.println("Google page title: " + driver.getTitle());
		
		driver.switchTo().window(facebookHandle);
		System.out.println("FaceBook page title: " + driver.getTitle());
		
		driver.switchTo().window(mainWindow);
		System.out.println("Back to main window: " + driver.getTitle());
		
	}
}
