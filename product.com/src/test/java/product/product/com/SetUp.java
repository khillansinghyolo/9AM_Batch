package product.product.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class SetUp {
public static WebDriver driver;

 @BeforeSuite
 public void setUp()
 {
	 driver=new FirefoxDriver();
	
 }
 @Test
 public void doLogin()
 { 	
	 driver.get("http://182.156.251.238/Wiz76QC/Default.aspx");
	 driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
	 driver.findElement(By.xpath("//div[@id='divCaptchImage']/following::a[1]")).click();
	 System.out.println("login successfully");
 }
 @AfterSuite
 public void tearDown()
 {
	 driver.close();
 }

}
