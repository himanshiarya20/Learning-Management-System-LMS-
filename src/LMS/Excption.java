package LMS;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Excption {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d2 = new ChromeDriver();
		
		d2.navigate().to("https://www.fortunecloudindia.com/");
		
		d2.manage().window().maximize();
		
		String expTitle = "Home - Fortune Cloud Technologies";
		
		String actTitle = d2.getTitle();
	
		System.out.println(actTitle);
	
		if(expTitle.equals(actTitle))
		{
			System.out.println("Test Case is pass");
		}
		else
		{
			System.out.println("Test Case fail");
		}
		
		d2.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement services = d2.findElement(By.xpath("(//a[text()=\"Services\"])[1]"));
		//services.click();		OR
		Actions act = new Actions(d2);
		act.moveToElement(services).perform();
		Thread.sleep(2000);
		
		WebElement staff = d2.findElement(By.xpath("(//a[text()=\"Staffing & Recruitment\"])[1]"));
		staff.click();
		System.out.println("Staffing & Recruitment is present");
		
		try
		{
			WebElement gallery = d2.findElement(By.xpath("(//a[text()=\"Gallery\"])[1]"));
			gallery.click();
			System.out.println("Gallery page is present");
		}
		catch(Exception e)
		{
			System.out.println("WebElement not found");
		}
		
		WebElement blog = d2.findElement(By.xpath("(//a[text()=\"Blog\"])[1]"));
		blog.click();
		System.out.println("Blog page is present");
		
		//d2.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		d2.findElement(By.xpath("//b[text()=\" Student Login\"]")).click();
		
		ArrayList<String>  tab = new ArrayList<String> (d2.getWindowHandles());
		d2.switchTo().window(tab.get(1));
		
		WebElement id = d2.findElement(By.name("username"));
		id.click();
		id.sendKeys("himanshiarya4@gmail.com");
		
		WebElement pswrd = d2.findElement(By.name("password"));
		pswrd.click();
		pswrd.sendKeys("Himanshiarya@20");
		
		d2.findElement(By.name("login")).click();
	}

}
