package co.test.fblogin.fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestfbTest {

	public WebDriver driver= new FirefoxDriver();
	@Test
    public void test1 () throws InterruptedException {
		
	    driver.findElement(By.id("email")).getAttribute("");
		System.out.println("email is entered");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.id("pass")).sendKeys("101992");
		System.out.println("password is entered");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	    driver.findElement(By.id("loginbutton")).click();
		System.out.println("Login Successfully");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println("----------Test 1 complete ----------");
		
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
