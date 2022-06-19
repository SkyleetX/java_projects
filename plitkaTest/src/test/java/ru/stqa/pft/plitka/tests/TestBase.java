package ru.stqa.pft.plitka.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.plitka.appmanager.ApplicationManager;

public class TestBase {
    protected static final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    @Deprecated
    public void setUp() {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }
}
