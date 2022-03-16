package Findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> buttons = driver.findElements(By.xpath("(//input[@type='button'])[3]"));
		System.out.println(buttons.size());
		for(WebElement element:buttons ) {
			element.click();
			Thread.sleep(3000);
			
		}
		driver.navigate().back();
		Thread.sleep(3000);
		
		
	}

}
