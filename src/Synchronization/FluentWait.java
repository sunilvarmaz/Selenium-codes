package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("actiTIME"));
		System.out.println("Done");
		driver.close();
	}

}
