package LMS;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginLMS extends Connection
{
	@Test (priority=1)
	public void title()
	{
				
		String expTitle = "LMS | Student Login";
		
		String actTitle = driver.getTitle();
	
		System.out.println(actTitle);
	
		if(expTitle.equals(actTitle))
		{
			System.out.println("Test Case is pass");
		}
		else
		{
			System.out.println("Test Case is fail");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	}
	
	@Test (priority=2,enabled=true)
	public void verifyusernamevisibleornot() 
	{
		boolean isDisplayed =driver.findElement(By.xpath("//*[@id=\"id_username\"]")).isDisplayed();
		boolean isEnabled =driver.findElement(By.xpath("//*[@id=\"id_username\"]")).isEnabled();
		
		if(isDisplayed)
		{
			System.out.println("Username element is present");
		}
		else 
		{
			System.out.println("Username element is Not Present");
		}
	}
	
	@Test (priority=3,enabled=true)
	public void verifypasswordvisibleornot() 
	{
		boolean isDisplayed =driver.findElement(By.xpath("//*[@id=\"id_password\"]")).isDisplayed();
		boolean isEnabled =driver.findElement(By.xpath("//*[@id=\"id_password\"]")).isEnabled();
		
		if(isDisplayed)
		{
			System.out.println("Password element is present");
		}
		else 
		{
			System.out.println("Password element is Not Present");
		}
	}
	
	@Test (priority=4,enabled=false)
	public void email() throws InterruptedException
	{
	String arr[][] = {{"test1@gmail.com","himanshiarya4@gmail.com"},{"password1","Himanshiarya@20"}};
	
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			driver.findElement(By.name("username")).sendKeys(arr[i][j]);
			
			Thread.sleep(1000);
			WebElement unhide = driver.findElement(By.xpath("//i[@onclick=\"toggle_password(this)\"]"));
			unhide.click();

			driver.findElement(By.name("password")).sendKeys(arr[i+1][j]);
				
			Thread.sleep(1000);
			WebElement hide = driver.findElement(By.xpath("//i[@onclick=\"toggle_password(this)\"]"));
			hide.click();
				
			driver.findElement(By.name("login")).click();
			
			Thread.sleep(2000);

		}			
	}
}
	
	@Test(priority=5,enabled=false)
	public void message()
	{
//way-1
        WebElement  message=driver.findElement(By.xpath("(//script[@type=\"text/javascript\"])[4]"));
        message.getText();
        String msg = message.getText();

        //To verify home page as text contains "mngr79426"
        Assert.assertTrue(msg.equals("Successfully Log In"));
      //  Assert.assertTrue(message.equals("Successfully Log In"));
       
//way-2
     /*   WebElement msg = driver.findElement(By.xpath("(//script[@type=\"text/javascript\"])[4]"));
		String text=msg.getText();
		String expectedText = "Successfully Log In";
		Assert.assertEquals(text,expectedText);
	
//way-3
		String expectedMessage = "Successfully Log In";
		String message = driver.findElement(By.xpath("(//script[@type=\"text/javascript\"])[4]")).getText();
		Assert.assertTrue(message.contains(expectedMessage));
		
//Way-4
		WebElement message = driver.findElement(By.xpath("(//script[@type=\"text/javascript\"])[4]"));		
		if(message.isDisplayed())
		{
			System.out.println("Successfully Login message is displayed");
		}
		else 
		{
			System.out.println("Successfully Login message is Not displayed");
		}*/
	}
	
	@Test (priority=4,enabled=true)
	public void username() throws InterruptedException
	{
		WebElement email = driver.findElement(By.name("username"));
		email.click();
		email.sendKeys("himanshiarya4@gmail.com");
		
		Thread.sleep(1000);

		WebElement unhide = driver.findElement(By.xpath("//i[@onclick=\"toggle_password(this)\"]"));
		unhide.click();
		
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.click();
		password.sendKeys("Himanshiarya@20");
		
		Thread.sleep(1000);
		
		WebElement hide = driver.findElement(By.xpath("//i[@onclick=\"toggle_password(this)\"]"));
		hide.click();
		              
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}
	
	@Test (priority=4,enabled=false)
	public void playlist() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\" LMS Playlist \"]")).click();
		
		ArrayList<String>  tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
	}
	
	@Test (priority=4,enabled=false)
	public void apk() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\" APK Download \"]")).click();
		
		ArrayList<String>  tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
	}
	
	@Test (priority=4,enabled=false)
	public void footer() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement cravita = driver.findElement(By.xpath("//b[text()=\"Cravita Technologies India Pvt. Ltd.\"]"));
		cravita.click();
		
		ArrayList<String>  tab = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		String expTitle = "Cravita | Excelling with Technology | Home";
		
		String actTitle = driver.getTitle();
	
		System.out.println(actTitle);
	
		if(expTitle.equals(actTitle))
		{
			System.out.println("Cravita Technologies page is displayed");
		}
		else
		{
			System.out.println("Cravita Technologies page is not displayed");
		}
	}
}
