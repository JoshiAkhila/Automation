package co.test.fblogin.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println("Facebook webpage is open ");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("joshi.akhila@gmail.com");
		System.out.println("email is entered");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("23992");
		System.out.println("password is entered");
		
		WebElement Login = driver.findElement(By.id("loginbutton"));
		Login.click();
		
		System.out.println("Login Successfully");

		Thread.sleep(2000);
		
		
	}

}
