package Findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickradioButtons {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> buttons = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(buttons);
		int size = buttons.size();
		for(WebElement link:buttons ) {
			link.click();
		}
		for(int i = size-1;i>= 0;i--) {
			buttons.get(i).click();
			Thread.sleep(3000);
			
			
		}
		for(WebElement link:buttons ) {
			link.click();
			Thread.sleep(3000);
		}
	}

}
