package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlers {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/laptops/~cs-xlhvichs4g/pr?sid=6bo%2Cb5g&collection-tab-name=Thin%20and%20Light%20Laptops&otracker=clp_banner_2_4.bannerX3.BANNER_electronics-big-savings-days-sale-store_JS865ENSH4AR&fm=neo%2Fmerchandising&iid=M_a5ed5b98-52a6-4a6d-a709-4b842a892bfe_4.JS865ENSH4AR&ppt=clp&ppn=electronics-big-savings-days-sale-store&ssid=ikuewrlods0000001647241658599");
		driver.findElement(By.xpath("(//img[@alt = 'Lenovo IdeaPad 3 Core i3 10th Gen - (8 GB/256 GB SSD/Windows 11 Home) 15IML05 Thin and Light Laptop'])[1]"));
		Thread.sleep(3000);
		String window1 = driver.getWindowHandle();
		Set<String> window2 = driver.getWindowHandles();
		window2.remove(window1);
		for(String d:window2) {
			driver.switchTo().window(d);
		}
		System.out.println(window1);
		System.out.println(window2);
		Thread.sleep(3000);
		driver.close(); 
		
		
	}

}
