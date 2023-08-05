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

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class ContactUs extends com.TestBase.BaseTest{

 
  public ContactUs() throws IOException {
    super();
    //TODO Auto-generated constructor stub
  }
  //@Parameters({"URL"})
  @BeforeMethod(groups = "Sanity" )
  public void before() {
    setup(prop.getProperty("URL"));

     driver.findElement(By.id("toggle")).click();
    driver.findElement(By.xpath("//a[text()='Contact Us']")).click();;
    

    

  }

  @AfterMethod(groups = "Sanity" )
  public void close() {
  driver.quit();
  }
  @Test( groups = "Sanity" ,priority = 1 , description = "Fill the form", dataProvider = "Contact")
  public void ContactUs(String name, String phone) {
 WebElement form = driver.findElement(By.className("row"));
  form.findElement(By.xpath("//*[@id=\"wpcf7-f5-p12-o2\"]/form/div[2]/div/div[1]/div/span/input")).sendKeys(name);
  form.findElement(By.xpath("//*[@id=\"wpcf7-f5-p12-o2\"]/form/div[2]/div/div[2]/div/span/input")).sendKeys("Jodayn");
  form.findElement(By.xpath("//*[@id=\"wpcf7-f5-p12-o2\"]/form/div[2]/div/div[3]/div/span/input")).sendKeys("Jodayn@jodayn.com");
  form.findElement(By.xpath("//*[@id=\"wpcf7-f5-p12-o2\"]/form/div[2]/div/div[4]/div/span/input")).sendKeys(phone);
  form.findElement(By.xpath("//*[@id=\"wpcf7-f5-p12-o2\"]/form/div[2]/div/div[5]/div/span/input")).sendKeys("Hello Jodayn");
  form.findElement(By.xpath("//*[@id=\"wpcf7-f5-p12-o2\"]/form/div[2]/div/div[6]/div/span/select")).sendKeys("Testing");
  form.findElement(By.xpath("//*[@id=\"wpcf7-f5-p12-o2\"]/form/div[2]/div/div[7]/div/div/span/textarea")).sendKeys("Testing");
  form.findElement(By.xpath("//*[@id=\"wpcf7-f5-p12-o2\"]/form/div[2]/div/div[8]/span/input")).sendKeys("PTU4");
  form.findElement(By.xpath("//*[@id=\"wpcf7-f5-p12-o2\"]/form/div[2]/div/div[9]/div/input")).click();;
  }
  @DataProvider
  public Object[][] Contact() {
Object data [][] = new Object [4][2];
data [0][0] = "Jodayn";
data [0][1] = "123";
data [1][0] = "Ryan";
data [1][1] = "456";
data [2][0] = "Hammad";
data [2][1] = "789";
data [3][0] = "Nasser";
data [3][1] = "000";
return data;
  }
}

