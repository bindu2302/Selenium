package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement button2 = driver.findElement(By.id("but2"));
		System.out.println(button2.isEnabled());
		System.out.println(button2.isDisplayed());
		
		WebElement button1 = driver.findElement(By.id("but1"));
		System.out.println(button1.isEnabled());
		System.out.println(button1.isDisplayed());
		System.out.println(button1.isSelected());
		System.out.println(button1.getText());
		org.openqa.selenium.Dimension button1size = button1.getSize();
		System.out.println(button1size);
		System.out.println(button1size.width);
		System.out.println(button1size.height);

		

	}

}
