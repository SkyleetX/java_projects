package ru.stqa.pft.sandbox;

public class Text {

    public String text1;
    public String text2;
    public String name;
    public String surname;
    public int a;
    public int b;
    public double f;
    public double g;

    public Text (String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public Text (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Text (double f, double g) {
        this.f = f;
        this.g = g;
    }
    public Text() {

    }

    public String text() {
        return text1 + text2;
    }

    public String text2() {
        return text1 + text2 + "!!";
    }

    public String welcome(String name, String surname) {
        return "Welcome " + name + " " + surname + "!";
    }

    public int multiplication() {
        return a*b;
    }

    public int division (int c, int d) {
        return c/d;
    }

    public double sum () {
        return f + g;
    }
}
