package Selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class PrintAppTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    System.out.println("Page title is : " + driver.getTitle());
	    driver.close();

	}
}
