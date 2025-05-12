import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable_actions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		
		WebElement iframeEle = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframeEle);
		
		WebElement resizableBox = driver.findElement(By.id("resizable"));
		WebElement resizableHandle = driver.findElement(By.className("ui-resizable-se"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(resizableHandle).moveByOffset(50,50).release().perform();
		
		driver.switchTo().defaultContent();
	}

}
