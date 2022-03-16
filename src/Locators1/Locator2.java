package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/");
		WebElement a = driver.findElement(By.id("email--1"));
		a.sendKeys("Hello");
		driver.findElement(By.name("password")).sendKeys("string");
	}

}
