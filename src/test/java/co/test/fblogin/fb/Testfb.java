package co.test.fblogin.fb;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Testfb {
	public WebDriver driver= new FirefoxDriver();
	
	 @BeforeMethod(alwaysRun=true)
	  public void beforeTest()  { 
		  System.out.println("Open Firefox ");
		  driver= new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  System.out.println("Facebook webpage is open ");
	  }
	 
  @Test (priority=1)
  public void test1 () throws InterruptedException {
	 
	    driver.findElement(By.id("email")).sendKeys("joshi.akhila@gmail.com");
		System.out.println("email is entered");

		driver.findElement(By.id("pass")).sendKeys("231992");
		System.out.println("password is entered");
		
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Login Successfully");
		System.out.println("------ test 1 Completed---------");
		
		}
  
  @Test (priority=2)
  public void test2 () throws InterruptedException {
	    System.out.println("testing test 2");
	    
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElement(By.id("email")).sendKeys("joshi.akhila@gmail.com");
		System.out.println("email is entered");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.findElement(By.id("pass")).sendKeys("1992");
		System.out.println("password is incorrect");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Login is UnSuccessfully");
		System.out.println("-------test 2---------- ");
		
		 }
 
 @Test (priority=3)
  public void test3 () throws InterruptedException {
	  
	    WebElement username = driver.findElement(By.id("email"));
	    username.sendKeys("joshi.akla@gmail.com");
		System.out.println("email is incorrect");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1992");
		System.out.println("password is incorrect");
		
		WebElement Login = driver.findElement(By.id("loginbutton"));
		Login.click();
		System.out.println("Login is UnSuccessfully");
		System.out.println("-------test 3---------- ");
}
  @Test (priority=4,enabled= true)
  public void test4 () throws InterruptedException {
	 
	    driver.findElement(By.id("email")).sendKeys("joshi.akla@gmail.com");
		System.out.println("email is incorrect");

		driver.findElement(By.id("pass")).sendKeys("1023");
		System.out.println("password is correct");
		
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Login is UnSuccessfully");
		System.out.println("-------test 4 ---------- ");
		Thread.sleep(1000);
}
  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.quit();
	  System.out.println(" Quit Facebook webpage");
  }
  
}
