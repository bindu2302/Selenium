import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@maxlength= '10' and @name='name']"));
		firstname.sendKeys("Himabindu");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@maxlength = '15' and @name='name']"));
		lastname.sendKeys("Nara");
		
		driver.findElement(By.xpath("//input[@type='text' and @required]")).sendKeys("naarahimabindu@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password' and @required])[1]")).sendKeys("Bindu@520");
		driver.findElement(By.xpath("(//input[@type='password' and @required])[2]")).sendKeys("Bindu@520");
		
		driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
		
//		driver.findElement(By.xpath("//button[@type='reset' or @name='refreshbtn']")).click();
	}

}
