package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.getTitle();
		
	}

}
