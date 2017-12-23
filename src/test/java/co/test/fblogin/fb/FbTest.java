package co.test.fblogin.fb;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class FbTest {

	public WebDriver driver= new FirefoxDriver();
 
	@Test
    public void test1 () throws InterruptedException {
		
	    driver.findElement(By.id("email")).sendKeys("joshi.akhila@gmail.com");
		System.out.println("email is entered");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.id("pass")).sendKeys("292");
		System.out.println("password is entered");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	    driver.findElement(By.id("loginbutton")).click();
		System.out.println("Login Successfully");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println("----------Test 1 complete ----------");
		
  }
	@Test(priority=1)
	public void test2 () throws InterruptedException {
		
         driver.findElement(By.className("_1frb")).sendKeys("Pranoti Kulkarni");
         System.out.println("search found");
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
         
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         System.out.println("search botton clicked ");
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
         System.out.println("----------Test 2 complete ----------");
  }
	@Test(priority=2,enabled= true)
	public void 	test3 () throws InterruptedException {
		
		driver.findElement(By.id("u_0_c")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        System.out.println("Go back  to home");
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.name("xhpc_message")).sendKeys("HI");  
        System.out.println("Write a Post");
        
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("button[data-testid='react-composer-post-button']"));
        System.out.println("post botton is clicked");
        System.out.println("----------Test 3 complete ----------");
 }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException { 
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  System.out.println("Facebook webpage is open ");
  }

  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }  
}
