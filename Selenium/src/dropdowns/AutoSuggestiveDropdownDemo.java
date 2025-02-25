package dropdowns;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AutoSuggestiveDropdownDemo{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demoSite/practice/autocomplete/combobox.html");
		Thread.sleep(3000);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the search text: ");
		String searchText = scan.nextLine();
		System.out.println("Enter the expected text to select: ");
		String expectedText = scan.nextLine();
		scan.close();
		
		//driver to locate the search input field
		WebElement searchBox = driver.findElement(By.className("custom-combobox-input"));
		searchBox.sendKeys(searchText);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@id = 'ui-id-1']/li/div"));
		if(suggestions.isEmpty()) {
			
			System.out.println("No suggestion available  for input: " + searchText);
		}
		else
		{
			System.out.println("Suggestions available for given input: " + searchText);
			for(WebElement suggestion: suggestions) {
				System.out.println("#" + suggestion.getText());
			}
		}
		boolean matchFound = false;
		for(WebElement suggestion:suggestions) {
			String suggestionText = suggestion.getText();
			if(suggestionText.toLowerCase().contains(expectedText.toLowerCase()))
			{
			suggestion.click();
			matchFound = true;
			System.out.println("Selected suggestion: " + suggestionText);
			break;
		}
	}

	if(!matchFound) {
			System.out.println("No match found in suggestions for expectced text given: " + expectedText);

		}
	}

}
