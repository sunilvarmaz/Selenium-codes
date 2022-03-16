package Synchronization;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explict {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		/*wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
		
		wait.until(ExpectedConditions.urlContains("https://demo.actitime.com/user/submit_tt.do"));
		
		wait.until(ExpectedConditions.elementToBeSelected(By.id("keepLoggedInLabel")));*/
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		
		
		
		
	}

}
