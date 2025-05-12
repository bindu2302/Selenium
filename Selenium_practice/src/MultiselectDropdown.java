import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	
		WebElement ideDropdown = driver.findElement(By.id("ide"));
		
		Select dropdown = new Select(ideDropdown);
		
		if(dropdown.isMultiple()) {
			dropdown.selectByIndex(0);
			Thread.sleep(2000);
			
			dropdown.selectByValue("ij");
			Thread.sleep(2000);
			
			dropdown.selectByVisibleText("Visual Studio");
			Thread.sleep(2000);
			
			List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();
			System.out.println("Selected IDE: ");
			
			for(WebElement option: selectedOptions) {
				System.out.println(option.getText() + ", ");
			}
			System.out.println();
			System.out.println(selectedOptions);
			Thread.sleep(2000);
			
			dropdown.deselectAll();
		}
	}

}
