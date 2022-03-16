package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.khanacademy.org/login");
		WebElement a = driver.findElement(By.id("uid-login-form-0-wb-id-identifier-field"));
		a.sendKeys("Hello String");
		driver.findElement(By.className("_1azps1NaN")).sendKeys("string");
	
	}

}
