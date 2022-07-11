package ru.openru.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainHelper extends HelperBase{

    public MainHelper(WebDriver wd) {
        super(wd);
    }

    public void fillFormAndSubmit() {
        type(By.name("q"), "Открытие");
        pressEnter(By.name("q"));
    }

    public boolean checkOpenruOnPage() {
        By locator = By.cssSelector("a[href*='open.ru']");
        if (isElementPresent(locator)) {
            click(locator);
            return true;
        }
        return false;
    }

    public boolean checkUSD() {
        String buyStr = wd.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[7]/section/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[2]/td[4]/div/span")).getText();
        double buy = Double.parseDouble(buyStr.replace(',', '.'));

        String sellStr = wd.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[7]/section/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[2]/td[2]/div/span")).getText();
        double sell = Double.parseDouble(sellStr.replace(',', '.'));

        return buy > sell;
    }

    public boolean checkEUR() {
        String buyStr = wd.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[7]/section/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[3]/td[4]/div/span")).getText();
        double buy = Double.parseDouble(buyStr.replace(',', '.'));

        String sellStr = wd.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[7]/section/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[3]/td[2]/div/span")).getText();
        double sell = Double.parseDouble(sellStr.replace(',', '.'));

        return buy > sell;
    }
}
