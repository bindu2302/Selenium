package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HyrStaticDropdown2 {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		Thread.sleep(3000);
		
		WebElement courseDropdown = driver.findElement(By.id("course"));
		Select dropdown = new Select(courseDropdown);
		
		Thread.sleep(3000);
		dropdown.selectByIndex(2);  //select dot net
		Thread.sleep(3000);
		String selectedCourse1 = dropdown.getFirstSelectedOption().getText();
		System.out.println("Selected Course by Index " + selectedCourse1);
		
		Thread.sleep(3000);
		dropdown.selectByValue("java");
		Thread.sleep(3000);
		String selectedCourse2 = dropdown.getFirstSelectedOption().getText();
		System.out.println("Selected Course by Index " + selectedCourse2);
		

		driver.quit();

	}
}
