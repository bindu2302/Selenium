import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		System.out.println("get the size of window: "+ driver.manage().window().getSize());
//		driver.get("https://www.google.com");
//		String url = driver.getCurrentUrl();
//		String title = driver.getTitle();
//		String pagesource = driver.getPageSource();
//		Set<String> handles = driver.getWindowHandles();
//		String handle = driver.getWindowHandle();
//		
//		
//		System.out.println(url);
//		System.out.println(title);
////		System.out.println(pagesource);
//		System.out.println(handles);
//		System.out.println(handle);
//		
	}
		
}
