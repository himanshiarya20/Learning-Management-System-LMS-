package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LogoutLMS extends GetUpdates
{
  @Test (priority=6,enabled=true)
  public void logout() throws InterruptedException 
  {
	  WebElement Lout = driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[5]"));
	  Lout.click();		//OR
	  //Actions act = new Actions(driver);
	  //act.moveToElement(Lout).perform();
	  Thread.sleep(1000);
		
	  WebElement logoutt = driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[7]"));
	  logoutt.click();
	  System.out.println("LMS is Logged Out");
  }
}
