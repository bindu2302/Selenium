package actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		
		//selenium please charge focus to iframe
		WebElement myIframe = driver.findElement(By.cssSelector(".demo-frame"));
		WebElement autoComplete = driver.findElement(By.xpath("//a[text()='Autocomplete']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(autoComplete).build().perform();
		driver.switchTo().frame(myIframe);
		List<WebElement>itemsList = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		
		act.keyDown(Keys.CONTROL)
		  .click(itemsList.get(1))
		  .click(itemsList.get(4))
		  .click(itemsList.get(5))
		  .click(itemsList.get(6))
		  .release()
		  .build().perform();
		
		driver.switchTo().defaultContent();
	}

}
