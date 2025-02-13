package browserautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMinimizeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		System.out.println("Window Size: " + driver.manage().window().getSize());
		//(1050,798) here 1050 is width and 798 is height in pixels

		driver.getPageSource();
	}

}
