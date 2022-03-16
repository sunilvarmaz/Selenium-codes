package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.linkText("Register"));
		a.click();
		
		}

}
