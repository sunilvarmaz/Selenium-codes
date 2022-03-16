package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vv {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement we=driver.findElement(By.id("newsletter-subscribe-button"));
		System.out.println(we.getAttribute("class"));
		driver.close();
		
	}
}
