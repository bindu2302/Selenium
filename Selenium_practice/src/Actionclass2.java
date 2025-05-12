import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kodnest.com/");
		
		WebElement youtubelink = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/KodNest']"));
		WebElement githublink = driver.findElement(By.xpath("//a[@href='https://github.com/Kodnest']"));
		WebElement instalink = driver.findElement(By.xpath("//a[@href='https://www.instagram.com/kodnest']"));
		WebElement facebooklink = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/kodnest']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(youtubelink).keyDown(Keys.CONTROL).click()
		.moveToElement(githublink).click()
		.moveToElement(instalink).click()
		.moveToElement(facebooklink).click()
		.keyUp(Keys.CONTROL).build().perform();

	}

}
