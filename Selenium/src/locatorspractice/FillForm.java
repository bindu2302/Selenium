package locatorspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@maxlength = '10'][@name = \"name\"]"));
		firstname.sendKeys("Himabindu");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@maxlength = '15'][@name = \"name\"]"));
		lastname.sendKeys("Nara");
		
		//email
		driver.findElement(By.xpath("//input[@type=\"text\"][@required]")).sendKeys("naarahimabindu@gmail.com");
		//password
		driver.findElement(By.xpath("//div[@class='container']/div/input[@type=\"password\"]")).sendKeys("Kodnest");
		//repeat password
		driver.findElement(By.xpath("//input[@maxlength=\"15\"][@name=\"name\"]/following-sibling::input[@type=\"password\"]")).sendKeys("Kodnest");
		//register
		driver.findElement(By.xpath("//button[@class='btn'][text()='Register']")).click();

		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		
				

	}

}
