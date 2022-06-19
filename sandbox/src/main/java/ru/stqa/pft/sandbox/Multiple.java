package ru.stqa.pft.sandbox;

public class Multiple {

    public TestMethodFromClass testMethodFromClass = new TestMethodFromClass();

    public Data data = new Data(testMethodFromClass.a, testMethodFromClass.b);

    public int multipleNumbers() {
        return data.a * data.b;
    }
}
