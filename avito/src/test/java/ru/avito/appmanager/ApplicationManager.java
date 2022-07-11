package ru.avito.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ApplicationManager {

    WebDriver wd;
    private MainHelper mainHelper;

    public void init() {
        ChromeOptions opt = new ChromeOptions();
        opt.setPageLoadStrategy(PageLoadStrategy.NONE);
        wd = new ChromeDriver(opt);
        wd.get("https://www.avito.ru/");
        //wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wd.findElement(By.tagName("body")).sendKeys("Keys.ESCAPE");
        wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        mainHelper = new MainHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public MainHelper getMainHelper() {
        return mainHelper;
    }
}
