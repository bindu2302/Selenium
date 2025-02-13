package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement bestSellersLink = driver.findElement(By.linkText("Best Sellers"));
		bestSellersLink.click();
		System.out.println(driver.getCurrentUrl());
		
	}

}
