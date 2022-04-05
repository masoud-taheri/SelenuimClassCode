package chapter02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class S0205_firefoxProfile4 {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement searchBox = driver.findElement(By.id("search"));
	  searchBox.sendKeys("Phones");
	  WebElement searchButton = driver.findElement(By.xpath("/html/body/div/div[2]/"
					+ "header/div/div[4]/form/div[1]/button[1]"));
	  searchButton.click();
	  Assert.assertEquals(driver.getTitle(), "Search results for: 'Phones'");
	  Assert.assertEquals(driver.getTitle(), "Search results for: 'Phones'");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver","src/test/resources/drivers//geckodriver");
	  ProfilesIni profini = new ProfilesIni();
	  //*driver = new ChromeDriver();
	  FirefoxProfile profile =  profini.getProfile("default");
	  FirefoxOptions firefoxoptions = new FirefoxOptions();
	  firefoxoptions.setProfile(profile);
	  //*firefoxoptions.setHeadless(true);
	  driver = new FirefoxDriver(firefoxoptions);
	  driver.get("http://demo-store.seleniumacademy.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  //*driver.quit();
  }

}
