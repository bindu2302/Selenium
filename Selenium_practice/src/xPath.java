import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.kodnest.com/login");
		
		WebElement email = driver.findElement(By.xpath("//input[@name = 'email']"));
		email.sendKeys("naarahimabindu@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type = 'password']"));
		pass.sendKeys("Bindu@520");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@id = 'login-submit-button']"));
		submitButton.click();
		
		WebElement course = driver.findElement(By.xpath("//*[@id= 'header-item-1']"));
		course.click();
	}
}
