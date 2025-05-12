import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(2000);
		
		Alert alertBox = driver.switchTo().alert();
//		alertBox.accept();
		alertBox.dismiss();
		
		
		
	}

}
