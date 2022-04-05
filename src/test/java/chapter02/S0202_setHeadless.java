package chapter02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class S0202_setHeadless {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement searchBox = driver.findElement(By.xpath("/html/body/div/div[2]/header/"
		  		+ "div/div[4]/form/div[1]/input"));
	  searchBox.sendKeys("Phone");
	  WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div[2]/"
					+ "header/div/div[4]/form/div[1]/button[1]"));
	  searchButton.click();
	  Assert.assertEquals(driver.getTitle(), "earch results for: 'Phone'");
	  Assert.assertEquals(driver.getTitle(), "Search results for: 'Phone'");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver","src/test/resources/drivers//geckodriver");
	  //*driver = new ChromeDriver();
	  FirefoxOptions firefoxoptions = new FirefoxOptions();
	  firefoxoptions.setHeadless(true);
	  driver = new FirefoxDriver(firefoxoptions);
	  driver.get("http://demo-store.seleniumacademy.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
