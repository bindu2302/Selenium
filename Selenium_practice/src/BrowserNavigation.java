import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000); // wait 2 seconds
		System.out.println("Get url: " + driver.getCurrentUrl());
		System.out.println("Get title: " + driver.getTitle());
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000); // wait 2 seconds
		System.out.println("Get url: " + driver.getCurrentUrl());
		System.out.println("Get title: " + driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000); // wait 2 seconds
		System.out.println("Get url: " + driver.getCurrentUrl());
		System.out.println("Get title: " + driver.getTitle());
		
		
		driver.navigate().forward();
		Thread.sleep(2000); // wait 2 seconds
		System.out.println("Get url: " + driver.getCurrentUrl());
		System.out.println("Get title: " + driver.getTitle());
		
		driver.navigate().refresh();
		Thread.sleep(2000); // wait 2 seconds
		System.out.println("Get url: " + driver.getCurrentUrl());
		System.out.println("Get title: " + driver.getTitle());
		
		
		
		driver.quit();
		
	}

}
