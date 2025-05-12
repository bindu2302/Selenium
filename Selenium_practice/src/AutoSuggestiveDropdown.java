import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demoSite/practice/autocomplete/combobox.html");
		
		Thread.sleep(2000);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter search text: ");
		String searchText = scanner.nextLine();
		System.out.println("Enter expected text: ");
		String expectedText = scanner.nextLine();
		
		WebElement searchBox = driver.findElement(By.className("custom-combobox-input"));
		searchBox.clear();
		searchBox.sendKeys(searchText);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		if(suggestions.isEmpty()) {
			System.out.println("No suggestions are there");
		} else {
			for(WebElement suggestion:suggestions) {
				System.out.println("Suggestions are: " + suggestion.getText());
			}
		}
		
		boolean isFound = false;
		for(WebElement suggestion : suggestions) {
			String suggestionText = suggestion.getText();
			if(suggestionText.toLowerCase().contains(expectedText.toLowerCase())) {
				suggestion.click();
				isFound = true;
				System.out.println("Selected text: " + suggestionText);
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("No suggestions");
		}
		
	}
}
