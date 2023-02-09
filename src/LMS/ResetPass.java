package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ResetPass extends GetUpdates
{
  @Test (priority=7,enabled=true)
  public void rpass() throws InterruptedException 
  {
	  WebElement Lout = driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[5]"));
	  Lout.click();		//OR
	  //Actions act = new Actions(driver);
	  //act.moveToElement(Lout).perform();
	  Thread.sleep(1000);
		
	  WebElement logoutt = driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[6]"));
	  logoutt.click();
	  System.out.println("Reset Password Page");
  }
  
  @Test (priority=8,enabled=true)
  public void resetpass() throws InterruptedException
  {
	  WebElement unhide1 = driver.findElement(By.xpath("(//i[@onclick=\"toggle_password(this)\"])[1]"));
	  unhide1.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement oldpass = driver.findElement(By.name("oldpassword"));
	  oldpass.click();
	  oldpass.sendKeys("");
	  
	  Thread.sleep(1000);
	  
	  WebElement hide1 = driver.findElement(By.xpath("(//i[@onclick=\"toggle_password(this)\"])[1]"));
	  hide1.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement unhide2 = driver.findElement(By.xpath("(//i[@onclick=\"toggle_password(this)\"])[2]"));
	  unhide2.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement newpass = driver.findElement(By.name("password"));
	  newpass.click();
	  newpass.sendKeys("Himanshiarya@20");
	  
	  Thread.sleep(1000);
	  
	  WebElement hide2 = driver.findElement(By.xpath("(//i[@onclick=\"toggle_password(this)\"])[2]"));
	  hide2.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement unhide3 = driver.findElement(By.xpath("(//i[@onclick=\"toggle_password(this)\"])[3]"));
	  unhide3.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement cnfrmpass = driver.findElement(By.name("cpassword"));
	  cnfrmpass.click();
	  cnfrmpass.sendKeys("Himanshiarya@20");
	  
	  Thread.sleep(1000);
	  
	  WebElement hide3 = driver.findElement(By.xpath("(//i[@onclick=\"toggle_password(this)\"])[3]"));
	  hide3.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement reset = driver.findElement(By.name("submit"));
	  reset.click();
	  
  }
}
