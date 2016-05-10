package DemoFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Google site");
  }
  @BeforeMethod
  public void beforeMethod() {
  driver = new FirefoxDriver();
  driver.get("http://www.google.com");
  }

  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }

}
