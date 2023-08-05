package com.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public static Properties prop;
 public static WebDriver driver;
public static EventFiringWebDriver e_driver;
  public BaseTest() throws IOException{
 prop = new Properties();
FileInputStream file = new FileInputStream("C:\\Users\\RayanAlOthaim\\OneDrive - JODAYN\\Documents\\VSC\\Selenium\\Proj0\\Proj1\\jodayn\\src\\test\\java\\com\\config\\config.properties");
prop.load(file);
  }
public void setup(String url) {

WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.get(url);
}
}
