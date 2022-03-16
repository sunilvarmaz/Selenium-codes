package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://linkedin.com");
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.close();
	}
	

}
