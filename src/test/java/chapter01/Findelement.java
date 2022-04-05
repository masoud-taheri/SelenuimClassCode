package chapter01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Findelement {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement> elms = driver.findElements(By.tagName("a"));
	  System.out.println(elms.size());
	  for(WebElement we: elms) {
		  String str = we.getText();
		  boolean emp = str.isEmpty();
		  if(emp) continue;
		  System.out.println(we.getText());
	  }
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
