package chapter01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class S0108ByMechanism_cssSelector {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement mylink = driver.findElement(By.cssSelector("body > div > div.page > div.footer-container > div > div:nth-child(4) > ul > li.first > a"));
	  mylink.click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","/home/masoud/eclipse-workspace/chromedriver");
	  driver = new ChromeDriver();
	  driver.get("http://demo-store.seleniumacademy.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
