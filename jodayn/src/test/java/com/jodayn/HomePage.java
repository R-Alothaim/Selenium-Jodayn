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
import org.testng.annotations.Test;

import com.beust.ah.A;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertArrayEquals;

import java.time.Duration;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class HomePage {
         WebDriver driver;
        @BeforeMethod
        public void setup() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://jodayn.com/");
        }

        @AfterMethod
        public void close() {
        driver.quit();
        }
@Test(description = "This is for title")
public void title(){
        String expectedResult = "JODAYN";

        
        String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle, expectedResult);
}
@Test(description = "This is for logo")
public void logo(){
     
        WebElement logo = driver.findElement(By.xpath("//img[@alt='logo']"));
        Assert.assertTrue(logo.isDisplayed());
}
@Test(description = "This is for social media")
public void socialMedia(){
       
        WebElement facebook = driver.findElement(By.xpath("//i[@class='fa fa-facebook']"));
        WebElement twitter = driver.findElement(By.xpath("//i[@class='fa fa-twitter']"));
        WebElement linkedin = driver.findElement(By.xpath("//i[@class='fa fa-linkedin']"));
                Assert.assertTrue(facebook.isDisplayed() && twitter.isDisplayed() && linkedin.isDisplayed());

}
@Test(description = "This is for social media links")
public void socialMediaLinks(){
       
        WebElement facebook = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/jodayn']"));
        WebElement twitter = driver.findElement(By.xpath("//a[@href='https://twitter.com/jodayn']"));
        WebElement linkedin = driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/2312129']"));
        linkedin.click();
                        Assert.assertTrue(facebook.isDisplayed() && twitter.isDisplayed() && linkedin.isDisplayed());

}

@Test(description = "This is for menu links")
public void links(){
        String [] links = {"https://www.jodayn.com/",
                "https://www.facebook.com/jodayn",
                "https://twitter.com/jodayn",
                "https://www.linkedin.com/company/2312129",
                "https://www.jodayn.com/#",
                "https://www.jodayn.com/#menu",
                "https://www.jodayn.com/",
                "https://www.jodayn.com/about-us/",
                "https://www.jodayn.com/management/",
                "https://www.jodayn.com/news/",
                "https://www.jodayn.com/jobs/",
                "https://www.jodayn.com/contact-us/",
                "https://www.jodayn.com/testing/",
                "https://www.jodayn.com/#",
                "https://www.jodayn.com/consulting/",
                "https://www.jodayn.com/software-solutions/",
                "https://www.jodayn.com/cybersecurity-services/",
                "https://www.jodayn.com/training/",
                "https://www.jodayn.com/training/",
                "https://www.jodayn.com/training-courses/",
                "https://www.jodayn.com/prosci-change-management/",
                "https://www.jodayn.com/prosci-methodology/",
                "https://www.jodayn.com/jodayn-blog/",
                "https://www.jodayn.com/",
                "https://www.jodayn.com/about-us/",
                "https://www.jodayn.com/management/",
                "https://www.jodayn.com/news/",
                "https://www.jodayn.com/jobs/",
                "https://www.jodayn.com/contact-us/",
                "https://www.jodayn.com/testing/",
                "https://www.jodayn.com/#",
                "https://www.jodayn.com/consulting/",
                "https://www.jodayn.com/software-solutions/",
                "https://www.jodayn.com/cybersecurity-services/"
                };
       WebElement lin = driver.findElement(By.className("menu-item"));
       for (int i = 0; i <links.length; i++) {
                String link = lin.findElements(By.xpath("//a")).get(i).getAttribute("href");
                Assert.assertEquals(link,links[i]);

        }



}
@Test(description = "This is for menu ")
public void menu(){
               WebElement About = driver.findElement(By.xpath("//a[text()='About Us']"));
                 WebElement OurLeadership = driver.findElement(By.xpath("//a[text()='Our Leadership']"));
                        WebElement News = driver.findElement(By.xpath("//a[text()='News']"));
                        WebElement Careers = driver.findElement(By.xpath("//a[text()='Careers']"));
                        WebElement ContactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
                        WebElement SoftwareTesting = driver.findElement(By.xpath("//a[text()='Software Testing']"));
                        WebElement ITServices = driver.findElement(By.xpath("//a[text()='IT Services']"));
                        WebElement ITConsulting = driver.findElement(By.xpath("//a[text()='IT Consulting']"));
                        WebElement ITSolutions = driver.findElement(By.xpath("//a[text()='IT Solutions']"));
                        WebElement CyberSecurity = driver.findElement(By.xpath("//a[text()='Cybersecurity']"));
                        WebElement Training = driver.findElement(By.xpath("//a[text()='Training']"));
                        WebElement TrainingScheduleRegistration = driver.findElement(By.xpath("//a[text()='Training Schedule & Registration']"));
                        WebElement AllTrainingCourses = driver.findElement(By.xpath("//a[text()='All Training Courses']"));
                        WebElement ProsciChangeManagement = driver.findElement(By.xpath("//a[text()='Prosci Change Management']"));
                        WebElement ProsciMethodology = driver.findElement(By.xpath("//a[text()='PROSCI Methodology']"));
                        WebElement Blog = driver.findElement(By.xpath("//a[text()='Blog']"));

}
@Test(description = "This is for images") 
public void images(){
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); 
        WebElement image1 = driver.findElement(By.xpath("//li[@data-thumb='https://www.jodayn.com/wp-content/uploads/2017/12/software-testing-3-100x50.jpg']"));                
         WebElement image2 = driver.findElement(By.xpath("//li[@data-thumb='https://www.jodayn.com/wp-content/uploads/2021/07/Screenshot_1-copy-100x50.jpg']"));
         //driver.findElement(By.className("tp-rightarrow")).click();
          WebElement image3 = driver.findElement(By.xpath("//li[@data-thumb='https://www.jodayn.com/wp-content/uploads/2018/04/quality-management1-100x50.jpg']"));
           WebElement image4 = driver.findElement(By.xpath("//li[@data-thumb='https://www.jodayn.com/wp-content/uploads/2018/04/Security-Assessment-1-100x50.jpg']"));
            WebElement image5 = driver.findElement(By.xpath("//li[@data-thumb='https://www.jodayn.com/wp-content/uploads/2018/04/Infrastructure-Architecture-1-100x50.jpg']"));
             WebElement image6 = driver.findElement(By.xpath("//li[@data-thumb='https://www.jodayn.com/wp-content/uploads/2018/04/training-slider-100x50.jpg']"));
              WebElement image7 = driver.findElement(By.xpath("//li[@data-thumb='https://www.jodayn.com/wp-content/uploads/2018/04/business-analysis-100x50.jpg']"));
               WebElement image8 = driver.findElement(By.xpath("//li[@data-thumb='https://www.jodayn.com/wp-content/uploads/2018/04/software-solutions1-100x50.jpg']"));
                WebElement image9 = driver.findElement(By.xpath("//li[@data-thumb='https://www.jodayn.com/wp-content/uploads/2018/04/Depositphotos_101357806_original-100x50.jpg']"));
                 WebElement image10 = driver.findElement(By.xpath("//li[@data-thumb='https://www.jodayn.com/wp-content/uploads/2018/04/saudi-vision-2030-100x50.png']"));
}
}