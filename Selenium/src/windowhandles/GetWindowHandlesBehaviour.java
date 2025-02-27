package windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesBehaviour {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/"); //1
		
		driver.findElement(By.linkText("pinterest")).click();//2
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("twitter")).click();//3
		System.out.println(driver.getCurrentUrl());


		driver.findElement(By.linkText("linkedin")).click();//4
		System.out.println(driver.getCurrentUrl());


		driver.findElement(By.linkText("google")).click();//5
		System.out.println(driver.getCurrentUrl());


		driver.findElement(By.linkText("facebook")).click();//6
		System.out.println(driver.getCurrentUrl());	
		
		
		 Set<String> allHandles= driver.getWindowHandles();
		 System.out.println(allHandles);
		 
		 System.out.println(allHandles.size());
		 
		 for(String handle: allHandles) {
			 driver.switchTo().window(handle);
			 System.out.println("Switched to Window with URL: " + driver.getCurrentUrl() + "with handle: " + handle);

		 }
	}

	

}
