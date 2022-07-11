package ru.avito.tests;

import org.testng.annotations.Test;

import java.io.IOException;

public class AvitoTests extends TestBase{

    @Test
    public void testAvito() throws InterruptedException, IOException {
        app.getMainHelper().selectMoscowCity();
        app.getMainHelper().selectPhotoOnly();
        app.getMainHelper().fillSearchForm();
        app.getMainHelper().sortByDate();
        app.getMainHelper().findItems();
        app.getMainHelper().writeToTxt();
    }
}
