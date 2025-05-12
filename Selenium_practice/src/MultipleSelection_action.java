import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleSelection_action {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		
		WebElement iframeEle = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframeEle);
		
		List<WebElement> selectable = driver.findElements(By.cssSelector("#selectable li"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
			.click(selectable.get(0))
			.click(selectable.get(2))
			.click(selectable.get(4))
			.keyUp(Keys.CONTROL)
			.perform();
		
		driver.switchTo().defaultContent();

	}

}
