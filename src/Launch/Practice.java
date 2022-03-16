package Launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;


public class Practice {
	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/ ");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File snap = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("./Screenshots/screenshort1.png");
		FileHandler.copy(snap, file);
		FileUtils.copyFile(file,snap);
		snap.renameTo(file);
		driver.close();
	

}
}