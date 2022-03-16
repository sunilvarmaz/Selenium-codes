package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//img[@alt='Picture of $25 Virtual Gift Card'])")).click();
	
		Thread.sleep(3000);
		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		
		
		
	}

}
