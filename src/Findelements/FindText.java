package Findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> buttons = driver.findElements(By.xpath("//a"));
		for(WebElement Links:buttons ) {
			System.out.println(Links.getText());
			
			System.out.println(Links.getAttribute("href"));
			System.out.println(Links.getSize());
			
		}
		
	}
}
