package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/laptops/~cs-xlhvichs4g/pr?sid=6bo%2Cb5g&collection-tab-name=Thin%20and%20Light%20Laptops&otracker=clp_banner_2_4.bannerX3.BANNER_electronics-big-savings-days-sale-store_JS865ENSH4AR&fm=neo%2Fmerchandising&iid=M_a5ed5b98-52a6-4a6d-a709-4b842a892bfe_4.JS865ENSH4AR&ppt=clp&ppn=electronics-big-savings-days-sale-store&ssid=ikuewrlods0000001647241658599");
		driver.findElement(By.xpath("//div[contains(text(),'HP Ryzen 3 Quad Core 5300U - (8 GB/512 GB SSD/Windows 11 Home) 14s-fq1089au Thin and Light Laptop')]")).click();
		Thread.sleep(3000);
		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		driver.close();
	}

}
