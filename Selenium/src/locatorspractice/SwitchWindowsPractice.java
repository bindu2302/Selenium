package locatorspractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowsPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/");
		
		driver.findElement(By.linkText("pinterest")).click();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("twitter")).click();
		System.out.println(driver.getCurrentUrl());


		driver.findElement(By.linkText("linkedin")).click();
		System.out.println(driver.getCurrentUrl());


		driver.findElement(By.linkText("google")).click();
		System.out.println(driver.getCurrentUrl());


		driver.findElement(By.linkText("facebook")).click();
		System.out.println(driver.getCurrentUrl());	
		
		
		 Set<String> allHandles= driver.getWindowHandles();
		 System.out.println(allHandles);
		 
		 System.out.println(allHandles.size());
		 
		 for(String handle: allHandles) {
			 driver.switchTo().window(handle);
		 }
		 System.out.println("Switched to Window with URL: " + driver.getCurrentUrl());
	}

}
