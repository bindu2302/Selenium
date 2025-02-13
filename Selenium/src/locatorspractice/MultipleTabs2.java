package locatorspractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/");
		
		driver.findElement(By.className("header_soc_pinterest")).click();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.className("header_soc_twitter")).click();
		System.out.println(driver.getCurrentUrl());


		driver.findElement(By.className("header_soc_linkedin")).click();
		System.out.println(driver.getCurrentUrl());


		driver.findElement(By.className("header_soc_google")).click();
		System.out.println(driver.getCurrentUrl());


		driver.findElement(By.className("header_soc_facebook")).click();
		System.out.println(driver.getCurrentUrl());	
		
		
		 Set<String> allHandles= driver.getWindowHandles();
		 System.out.println(allHandles);
	}
}
