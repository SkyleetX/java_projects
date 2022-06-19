package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenOddNumbersTests {

    @Test
    public void testEvenOddNumbers() {

        EvenOddNumbers evenOddNumbers = new EvenOddNumbers();
        Assert.assertEquals(evenOddNumbers.checkEven(245), "Число 245 нечетное");
        Assert.assertEquals(evenOddNumbers.checkEven(248), "Число 248 четное");
        Assert.assertEquals(evenOddNumbers.checkEven(25), "Число 25 нечетное");
    }
}
