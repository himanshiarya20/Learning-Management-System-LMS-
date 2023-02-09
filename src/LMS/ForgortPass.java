package LMS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ForgortPass extends LoginLMS
{
  @Test (priority=2)
  public void fpass() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[text()=\"Forget Password?\"]")).click();
	  
	  ArrayList<String>  tab = new ArrayList<String> (driver.getWindowHandles());
	  driver.switchTo().window(tab.get(0));
	  System.out.println("Reset Password page is dispalyed");
	  
	  WebElement username = driver.findElement(By.name("username"));
	  username.click();
	  username.sendKeys("himanshiarya4@gmail.com");
	  
	  //driver.findElement(By.name("submit")).click();

  }
}
