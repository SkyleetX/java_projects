package ru.openru.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    private NavigationHelper navigationHelper;
    private MainHelper mainHelper;

//    public ApplicationManager() {
//    }

    public void init() throws IOException {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navigationHelper = new NavigationHelper(wd);
        mainHelper = new MainHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public NavigationHelper goTo() {
        return navigationHelper;
    }

    public MainHelper getMainHelper() {
        return mainHelper;
    }
}
