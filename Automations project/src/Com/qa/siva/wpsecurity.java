package Com.qa.siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wpsecurity {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\com.qa.selenium.testng\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("email")).sendKeys("9052545009");

		

	}

}
