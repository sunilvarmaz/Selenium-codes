package Launch;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Point point  = new Point(10,30);
		driver.manage().window().setPosition(point);
		Dimension ds = new Dimension(200,4000);
		driver.manage().window().setSize(ds);
		
		
	}

}
