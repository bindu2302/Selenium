package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		
		//selenium please charge focus to iframe
		WebElement myIframe = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(myIframe);
		WebElement resizableElement = driver.findElement(By.id("resizable"));
		WebElement resizableElementHandle = driver.findElement(By.className("ui-icon-gripsmall-diagonal-se"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(resizableElement).moveByOffset(50, 50).release().build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Autocomplete']"));
	}

}
