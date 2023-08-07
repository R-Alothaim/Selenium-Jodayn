package com.jodayn;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.ah.A;
import com.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class ContactUsPageContent extends com.TestBase.BaseTest{

 
  public ContactUsPageContent() throws IOException {
    super();
    //TODO Auto-generated constructor stub
  }
  //@Parameters({"URL"})
  @BeforeMethod(groups = "Sanity" )
  public void before() {
    setup();

   

  }
  
  @AfterMethod(groups = "Sanity" )
  public void close() {
  driver.quit();
  }
  @Test(groups = "Sanity" )
  public void pagecontent() {
    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]"))).perform();
    driver.findElement(By.cssSelector(".nav > .menu-item:nth-child(2) .menu-item:nth-child(4) > a")).click();
     String check = driver.findElement(By.cssSelector(".logo-sloga > h4")).getText();
    Assert.assertEquals("Never Compromising On Quality", check);

    check = driver.findElement(By.cssSelector("h3")).getText();    

    Assert.assertEquals("CONTACT US", check);
    check = driver.findElement(By.cssSelector(".contacti > h4")).getText();
    Assert.assertEquals("CORPORATE ADDRESS", check);
    check = driver.findElement(By.cssSelector("td:nth-child(1) > strong")).getText();
    Assert.assertEquals("Saudi Arabia, Riyadh Office", check);
    check = driver.findElement(By.cssSelector("td:nth-child(1) > p:nth-child(3)")).getText();
    Assert.assertEquals("PO Box 340598, Riyadh \u2013 11333", check);
    check = driver.findElement(By.cssSelector("td:nth-child(1) > p:nth-child(4)")).getText();
    Assert.assertEquals("Tel: +966 (0) 11 466 1406", check);
    check = driver.findElement(By.linkText("info@jodayn.com")).getText();
    Assert.assertEquals("info@jodayn.com", check);
   check = driver.findElement(By.cssSelector("td:nth-child(2) > strong")).getText();
    Assert.assertEquals("Jordan, Amman Office", check);
    check = driver.findElement(By.cssSelector("td:nth-child(2) > p:nth-child(3)")).getText();
    Assert.assertEquals("P.O. Box 954245, Amman \u2013 11954", check);
    check = driver.findElement(By.cssSelector("td:nth-child(2) > p:nth-child(4)")).getText();

    Assert.assertEquals("Phone: +962 (0) 77 747 5359", check);
    check = driver.findElement(By.cssSelector("td:nth-child(2) a")).getText();
Assert.assertEquals("info@jodayn.com", check);
   WebElement img = driver.findElement(By.cssSelector(".enquiry-field:nth-child(3) .col-sm-12 > .wpcf7-form-control"));
Assert.assertTrue(img.isDisplayed()); 
   check = driver.findElement(By.cssSelector(".footer-logo > p")).getText();
   Assert.assertEquals("Copyright \u00A9 2018 Jodayn. All Rights Reserved", check);
  }

  }