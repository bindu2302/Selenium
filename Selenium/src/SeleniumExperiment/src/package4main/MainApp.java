package package4main;

import package1interface.WebDriver;
import package2implementationclass.ChromeDriver;
import package3utilitymethods.DriverUtilities;

public class MainApp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.close();
		driver.get("kodnest.com");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		//DriverUtilities.printDriverInfo();  will show error if method is non-static
//		printDriverInfo();  //will not work out
		DriverUtilities.printDriverInfo();  //will not show error if method is static
		
		
	}

}
