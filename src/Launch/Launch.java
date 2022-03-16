package Launch;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;

public class Launch {
	public static void main(String[] args) throws InterruptedException, MalformedURLException    {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.gmail.com//");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		URL url = new URL("https://www.gmail.com/");
		Thread.sleep(3000);
		driver.navigate().to(url);
	}

}