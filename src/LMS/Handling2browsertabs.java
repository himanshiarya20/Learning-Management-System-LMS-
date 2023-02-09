package LMS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling2browsertabs {

	public static void main(String[] args) throws InterruptedException 
	{
		// Set Driver path
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
		// Initialize driver  
		WebDriver driver=new ChromeDriver();

		//Maximize browser window   
		driver.manage().window().maximize();  
		//Go to URL  
		driver.get("http://www.google.com");  
		//Set timeout  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		// Open new tab  
	      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");  
	      //Go to URL  
	      driver.get("https://www.fortunecloudindia.com/");  
	      //Set new tab timeout  
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	           
	      // Switch first tab  
	      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");  
	      driver.switchTo().defaultContent();  
	      Thread.sleep(2000);  
	      
	      // Write search String  
	      WebElement search = driver.findElement(By.name("q"));		//search is object
			if(search.isDisplayed())
			{
				System.out.println("True");
				search.click();
				search.sendKeys("Fortune cloud technologies");
			}
			else
			{
				System.out.println("False");
			}
			
			search.sendKeys(Keys.ENTER); 
	      Thread.sleep(2000);  
	      
	     // Browser close   
	      driver.close(); 
	}

}
