package ru.stqa.pft.sandbox;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SendFormTest {

//    @Test
//    public void testGoogleSearch() throws InterruptedException {
//        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
//        System.setProperty("webdriver.chrome.driver", "/Git_repo/java_pft/sandbox/src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.google.com/");
//        Thread.sleep(5000);  // Let the user actually see something!
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("ChromeDriver");
//        searchBox.submit();
//        Thread.sleep(5000);  // Let the user actually see something!
//        driver.quit();
//    }
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Git_repo/java_pft/sandbox/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void sendFormTest() throws InterruptedException {
        driver.get("http://plitka-82.ru");
        //Thread.sleep(1000);
        driver.findElement(By.name("user_name")).sendKeys("test_name");
        driver.findElement(By.name("user_phone")).sendKeys("85952154548");
        driver.findElement(By.name("user_desc")).sendKeys("test_desc");
        driver.findElement(By.cssSelector("button")).click();
        //Thread.sleep(30000);
        Assert.assertEquals(driver.findElement(By.cssSelector("h1")).getText(), "Спасибо!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
