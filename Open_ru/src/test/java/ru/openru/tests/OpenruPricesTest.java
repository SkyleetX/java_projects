package ru.openru.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class OpenruPricesTest extends TestBase {

    @Test
    public void testOpenruPrices() {
        app.goTo().googlePage();
        app.getMainHelper().fillFormAndSubmit();
        assertTrue(app.getMainHelper().checkOpenruOnPage());
        assertTrue(app.getMainHelper().checkUSD());
        assertTrue(app.getMainHelper().checkEUR());
    }
}
