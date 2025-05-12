import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		
		WebElement courseDropdown = driver.findElement(By.id("course"));
		Select dropdown = new Select(courseDropdown);
		
		dropdown.selectByIndex(1);
		String course1 = dropdown.getFirstSelectedOption().getText();
		System.out.println(course1);
		
		
		dropdown.selectByValue("net");
		String course2 = dropdown.getFirstSelectedOption().getText();
		System.out.println(course2);
		
		dropdown.selectByVisibleText("Python");
		String course3 = dropdown.getFirstSelectedOption().getText();
		System.out.println(course3);
		
		List<WebElement> all = dropdown.getOptions();
		System.out.println(all);
	}

}
