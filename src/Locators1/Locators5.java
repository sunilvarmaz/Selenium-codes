package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
		WebElement a = driver.findElement(By.id("email"));
		a.sendKeys("fdfjd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("String");

	}

}
