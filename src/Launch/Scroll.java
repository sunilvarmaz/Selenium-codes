package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.id("vote-poll-1"));
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.ScrollTo(0,300)");
		driver.close();
		
		
		
		
	}

}
