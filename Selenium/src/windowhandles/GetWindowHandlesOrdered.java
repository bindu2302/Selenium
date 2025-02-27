package windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesOrdered {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/");
		
		driver.findElement(By.linkText("pinterest")).click();
		System.out.println(driver.getWindowHandles());	
		Thread.sleep(3000);	
		
		driver.findElement(By.linkText("twitter")).click();
		System.out.println(driver.getWindowHandles());	
		Thread.sleep(3000);	


		driver.findElement(By.linkText("linkedin")).click();
		System.out.println(driver.getWindowHandles());	
		Thread.sleep(3000);	


		driver.findElement(By.linkText("google")).click();
		System.out.println(driver.getWindowHandles());	
		Thread.sleep(3000);	


		driver.findElement(By.linkText("facebook")).click();
		System.out.println(driver.getWindowHandles());	
		Thread.sleep(3000);		
		
		 Set<String> allHandles= driver.getWindowHandles();
		 System.out.println(allHandles);
		 
		 System.out.println(allHandles.size());
		 
		 for(String handle: allHandles) {
			 driver.switchTo().window(handle);
			 System.out.println("Switched to url: " + driver.getCurrentUrl()+ "with handle: " + handle); 
		
		 }
		 
		 Iterator<String> itr = allHandles.iterator();
		 String mainWindow = itr.next();
		 String pinterestWindow = itr.next();
		 String twitterWindow = itr.next();
		 String linkedinWindow = itr.next();
		 String googleWindow = itr.next();
		 String facebookWindow = itr.next();
		 
		 System.out.println("Main window handle: " + mainWindow);
		 System.out.println("Pinterest window handle: " + pinterestWindow);
		 System.out.println("Twitter window handle: " + twitterWindow);
		 System.out.println("LinkedIn window handle: " + linkedinWindow);
		 System.out.println("google window handle: " + googleWindow);
		 System.out.println("facebook window handle: " + facebookWindow);


		 
		 
	}

}
