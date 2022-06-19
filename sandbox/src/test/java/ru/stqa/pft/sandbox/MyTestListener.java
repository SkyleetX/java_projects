package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyTestListener {

    @Test
    public void testGetSurnameFromApp() {
        ApplicationManager app = new ApplicationManager().withId(2).withName("test").withSurname("test2");
        System.out.println(app.getSurname());
        assertEquals(app.getSurname(), "test2");
    }
}
