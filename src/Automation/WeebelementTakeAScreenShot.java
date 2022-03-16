package Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WeebelementTakeAScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.linkText("14.1-inch Laptop")).findElement(By.xpath("(//input [@value = 'Add to cart'])[5]"));
		File srcFile = element.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File file = new File("./Screenshots/screenshot2.png");
		FileHandler.copy(srcFile, file);
		driver.close();
		
	}

}
