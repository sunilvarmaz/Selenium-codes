package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();		
	}
	


}
