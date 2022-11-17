package Com.qa.ajay;

import javax.swing.table.JTableHeader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajay {

	public static void main(String[] args) throws InterruptedException {	
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\com.qa.selenium.testng\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to(" https://www.google.com/");
           Thread.sleep(3000);
	}
}
