package browserautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpeningChromeProfile {

	public static void main(String[] args) {
		
		String userDirPath = "C:\\Users\\Admin\\AppData\\Local\\Google\\Chrome\\User Data";
		String profiledir = "Profile 4";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=" + userDirPath);
		options.addArguments("profile-directory=" + profiledir);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
	}

}
