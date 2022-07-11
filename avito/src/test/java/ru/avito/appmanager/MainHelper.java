package ru.avito.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.avito.model.ItemData;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainHelper extends HelperBase {

    private List<ItemData> list = new ArrayList<>();
    private List<ItemData> sorted = new ArrayList<>();

    public MainHelper(WebDriver wd) {
        super(wd);
    }

    public void selectMoscowCity() throws InterruptedException {
        waitElement(By.cssSelector("div[data-marker=\"search-form/region\"]")).click();
        type(By.cssSelector("input[data-marker=\"popup-location/region/input\"]"), "Москва");
        Thread.sleep(700);
        wd.findElement(By.cssSelector("ul[data-marker=\"suggest-list\"]")).findElement(By.cssSelector("li[data-marker=\"suggest(0)\"]")).click();
        click(By.cssSelector("button[data-marker=\"popup-location/save-button\"]"));
    }

    public void fillSearchForm() {
        type(By.cssSelector("input[data-marker=\"search-form/suggest\"]"), "iPhone xs 256");
        pressEnter(By.cssSelector("input[data-marker=\"search-form/suggest\"]"));
    }

    public void selectPhotoOnly() {
        waitElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div[4]/div/label[2]/span")).click();
    }

    public void sortByDate() {
        waitElement(By.cssSelector("option[data-marker=\"option(104)\"]")).click();
    }

    public void findItems() {
        waitElement(By.cssSelector("div[data-marker=\"item\"]"));
        List<WebElement> itemList = wd.findElements(By.cssSelector("div[data-marker=\"item\"]"));
        itemList.removeAll(getVipItems());

        for (int i = 0; i < 10; i++) {
            list.add(new ItemData().withTitle(itemList.get(i).findElement(By.cssSelector("a[data-marker=\"item-title\"]")).getText())
                    .withPrice(Integer.parseInt(itemList.get(i).findElement(By.cssSelector("span[data-marker=\"item-price\"]")).getText()
                            .replace(" ", "").replace("₽", "").replace("зауслугу", ""))));
        }

        sorted = list.stream().sorted(Comparator.comparingInt(ItemData::getPrice)).toList();
        for (ItemData itemData : sorted) {
            System.out.println(itemData);
        }
    }

    public List<WebElement> getVipItems() {
        List<WebElement> itemList = new ArrayList<>();
        List<WebElement> vipList = wd.findElements(By.className("items-vip-KXPvy"));

            for (WebElement vip : vipList) {
                List<WebElement> elements = vip.findElements(By.cssSelector("div[data-marker=\"item\"]"));
                itemList.addAll(elements);
            }
            return itemList;
    }

    public void writeToTxt() throws IOException {
        try (Writer writer = new FileWriter("src/test/resources/list.txt")) {
            for (ItemData element : sorted) {
                writer.write(String.format("%s, Цена: %s ₽\n", element.getTitle(), element.getPrice()));
            }
        }
    }
}
