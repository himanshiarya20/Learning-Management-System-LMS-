package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetUpdates extends LoginLMS
{
	@Test (priority=6,enabled=true)
	public void Getupdate() throws InterruptedException 
	{
		Thread.sleep(500);
		WebElement close = driver.findElement(By.xpath("(//button[@type=\"button\"])[9]"));
		close.click();
	}
	
	@Test (priority=5,enabled=false)
	public void subscribe() throws InterruptedException
	{
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='webpush-subscribe-button']")).click();
	}
}


		/*WebElement updates = driver.findElement(By.xpath("//h3[text()=\"Get Updates\"]"));
		//services.click();		OR
		Actions act = new Actions(driver);
		act.moveToElement(updates).perform();
		Thread.sleep(2000);*/
		
		//WebElement close = driver.findElement(By.xpath("(//span[text()=\"×\"])[1]"));
		//Thread.sleep(500);
		/*if(driver.switchTo().alert() != null)
		{
		    Alert alert = driver.switchTo().alert();
		    String alertText = alert.getText();
		    alert.dismiss(); // alert.accept();

		}*/
		
		
		/*if (close.isDisplayed()) 
		{
		    close.click();
	        System.out.println("Close button is clicked");
		}
		else
		{
	         System.out.println("Close button is not clicked");
		}	*/	
		
		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("arguments[0].click();", close);
	      boolean b = close.isEnabled();
	      if (b) 
	      {
		     close.click();
	         System.out.println("Close button is clicked");
	      }
	      else 
	      {
	         System.out.println("Close button is not clicked");
	      }*/

