package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class First {

	
		public static ChromeDriver driver;
		
		@BeforeMethod
		public void ProjectBase() {
			System.setProperty("webdriver.chrome.driver", "\"C://drivers/chrome/chromedriver.exe\"");
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(ops);
			
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.manage().window().maximize();
			
		
			
		}
		
		
		@AfterMethod
		public void teardown() {
			driver.close();
		}

	}
}
