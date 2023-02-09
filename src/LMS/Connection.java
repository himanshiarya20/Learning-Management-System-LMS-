package LMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Connection 
{
	static WebDriver driver;

	@BeforeTest
	public void Openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	//	driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://lms.fortunecloudindia.com/index/");
		System.out.println("The Page URL is Opened");

	}
	
	@AfterTest
	public void Closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
	}
}
