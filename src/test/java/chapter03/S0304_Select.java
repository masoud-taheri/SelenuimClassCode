package chapter03;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class S0304_Select {
	WebDriver driver;
  @Test
  public void f() {
	  Select slc = new Select(driver.findElement(By.id("select-language")));
	  slc.selectByIndex(1);
	  
	 // List<WebElement> languages = driver.findElements(By.id("select-langiage"));
	  //languages.stream().filter(t->t="German").
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","/home/masoud/eclipse-workspace/chromedriver");
	  driver = new ChromeDriver();
	  driver.get("http://demo-store.seleniumacademy.com/");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
