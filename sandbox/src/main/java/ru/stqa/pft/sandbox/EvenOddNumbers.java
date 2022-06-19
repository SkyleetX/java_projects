package ru.stqa.pft.sandbox;

public class EvenOddNumbers {

    public EvenOddNumbers() {
    }

    public String checkEven(int b) {
        int ost = b%2;
        if (ost == 0) {
            return "Число " + b + " четное";
        }
        return "Число " + b + " нечетное";
    }
}
