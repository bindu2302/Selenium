package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement ideDropdown = driver.findElement(By.id("ide"));
		Select multiDropdown = new Select(ideDropdown);
		Thread.sleep(3000);
		
		if(multiDropdown.isMultiple()) {
			System.out.println("Dropdown is multi-select");
			multiDropdown.selectByIndex(0);
			multiDropdown.selectByValue("ij");
			multiDropdown.selectByVisibleText("Visual Studio");
			
			List<WebElement>selectedOptions = multiDropdown.getAllSelectedOptions();
			System.out.println(selectedOptions);
			System.out.println("Selected IDEs: ");
			
			for(WebElement option: selectedOptions) {
				System.out.print(option.getText() + ", ");
			}
			
//			multiDropdown.deselectByIndex(0);
//			multiDropdown.deselectByValue("ij");
//			multiDropdown.deselectByVisibleText("Visual Studio");
//			multiDropdown.deselectAll();
		}

	}
}
