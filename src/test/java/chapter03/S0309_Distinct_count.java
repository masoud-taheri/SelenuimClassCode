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

public class S0309_Distinct_count {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement> lnks = driver.findElements(By.tagName("a"));
	  //System.out.println(lnks.stream().count());
	  System.out.println(lnks.stream().map(i->i.getText()).count());
	  System.out.println(lnks.stream().map(i->i.getText()).distinct().count());
	  lnks.stream().map(i->i.getText()).distinct().forEach(System.out::println);
	  System.out.println(lnks.stream().map(i->i.getText()).filter(i->i!=" ").count());
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
