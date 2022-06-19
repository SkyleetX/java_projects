package ru.stqa.pft.plitka.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    public WebDriver wd;
    private SendFormHelper sendFormHelper;

    public void init() {
        //System.setProperty("webdriver.chrome.driver", "/Git_repo/java_pft/sandbox/src/test/resources/chromedriver.exe");
        wd = new ChromeDriver();
        sendFormHelper = new SendFormHelper(wd);
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void stop() {
        if (wd != null) {
            wd.quit();
        }
    }

    public SendFormHelper getSendFormHelper() {
        return sendFormHelper;
    }
}

