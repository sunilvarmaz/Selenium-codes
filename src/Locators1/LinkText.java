package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.linkText("Register"));
		a.click();
		Thread.sleep(3000);
		WebElement b = driver.findElement(By.linkText("Log in"));
		b.click();
		Thread.sleep(3000);
		WebElement c = driver.findElement(By.linkText("Shopping cart"));
		c.click();
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.linkText("Wishlist"));
		d.click();
		Thread.sleep(3000);
	}

}

