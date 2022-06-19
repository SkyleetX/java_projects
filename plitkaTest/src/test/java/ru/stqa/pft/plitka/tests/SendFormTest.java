package ru.stqa.pft.plitka.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendFormTest extends TestBase {

    @Deprecated
    @Test
    public void sendFormTest() throws InterruptedException {
        app.getSendFormHelper().sendForm("test", "899285", "test_desc");
        Thread.sleep(1000);
        Assert.assertEquals(app.getSendFormHelper().getTextFromElement(By.cssSelector("h1")), "Спасибо!");
    }
}
