package ru.stqa.pft.plitka.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendFormHelper {

    private WebDriver wd;

    public SendFormHelper(WebDriver wd) {
        this.wd = wd;
    }


    public void sendForm(String name, String phone, String desc) throws InterruptedException {
        wd.get("http://plitka-82.ru");
        //Thread.sleep(1000);
        wd.findElement(By.name("user_name")).sendKeys(name);
        wd.findElement(By.name("user_phone")).sendKeys(phone);
        wd.findElement(By.name("user_desc")).sendKeys(desc);
        wd.findElement(By.cssSelector("button")).click();
        Thread.sleep(3000);
        //Assert.assertEquals(driver.findElement(By.cssSelector("h1")).getText(), "Спасибо!");
    }

    public String getTextFromElement (By locator) {
        return wd.findElement(locator).getText();
    }
}
