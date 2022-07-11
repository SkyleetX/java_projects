package ru.openru.appmanager;

import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void googlePage() {
        wd.get("https://www.google.com/");
    }
}
