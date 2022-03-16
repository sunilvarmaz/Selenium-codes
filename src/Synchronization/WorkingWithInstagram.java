package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithInstagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("varma.g.sunil");
		driver.findElement(By.name("password")).sendKeys("Sunil@8954");
		
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'sunil')]")).click();
		
		
		
		
		
		
		
	}
}