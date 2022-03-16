package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String username = "admin";
		String password = "manager";
		String HomeTitle = "Please identify yourself";
		WebElement userText = driver.findElement(By.id("username"));
		userText.clear();
		userText.sendKeys("admin");
		if(username.equals(userText.getAttribute("value"))) {
			System.out.println("The userName is valid");
		}else {
			
			System.out.println("The userName is Not Valid");
		}
		
		WebElement userPassword = driver.findElement(By.name("pwd"));
		userPassword.clear();
		userPassword.sendKeys(password);
		if(userPassword.equals(userPassword.getAttribute("value"))) {
			System.out.println("The given password is valid");
		}else {
			System.out.println("the given password is not valid");
		}
		
		
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));	
		login.click();
		Thread.sleep(3000);
		
	}
}
