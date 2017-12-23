package co.test.fblogin.fb;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver= new FirefoxDriver();
  @Test(priority=0)
  public void f() {
	  WebElement username = driver.findElement(By.id("email"));
	  username.sendKeys("joshi.akhila@gmail.com"); 
	  System.out.println("email is entered");
  }
 
  @Test(priority=1)
  public void f2() {
	 WebElement password = driver.findElement(By.id("pass"));
     password.sendKeys("2392");
		System.out.println("password is entered");
	
  }
  
  @Test(priority=2)
  public void f3() throws InterruptedException {
	  WebElement Login = driver.findElement(By.id("loginbutton"));
		Login.click();
		System.out.println("Login Successfully");
		Thread.sleep(2000);	
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  System.out.println("Facebook webpage is open ");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  System.out.println("Quit");
  }

}
