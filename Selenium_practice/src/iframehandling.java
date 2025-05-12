import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframehandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement iframeElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframeElement);
		
		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(driver);
//		act.dragAndDrop(source, target).perform();
		act.dragAndDropBy(source,100,50).perform();
		
		driver.switchTo().defaultContent();
		
	}

}
