package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeDriver driver = new  ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement a = driver.findElement(By.id("email"));
			a.sendKeys("Hello");
			driver.findElement(By.name("pass")).sendKeys("Password");
		}

	}



