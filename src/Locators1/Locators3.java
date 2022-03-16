package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		WebElement a = driver.findElement(By.id("source"));
		a.sendKeys("Hello");
		
		
	}

}
