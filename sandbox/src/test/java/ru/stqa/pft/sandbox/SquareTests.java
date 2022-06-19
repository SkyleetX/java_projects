package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(),25.0);
    }
    @Test
    public void testArea2() {
        SquareP squareP = new SquareP(5, 6);
        Assert.assertEquals(squareP.area2(),30.0);
    }
}
