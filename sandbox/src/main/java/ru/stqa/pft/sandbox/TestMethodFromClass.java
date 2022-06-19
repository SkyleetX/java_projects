package ru.stqa.pft.sandbox;

import java.util.Scanner;

public class TestMethodFromClass {

    public int a = 6; //для Multiple.class
    public int b = 6; //для Multiple.class

    public static void main(String[] args) {

        FromDaysToSeconds seconds = new FromDaysToSeconds(6);
        System.out.println(seconds.getSecondsFromDays());

        Text text = new Text("Hello ", "world!"); //конструктор с параметрами для текста
        System.out.println(text.text());
        System.out.println(text.text2());

        Text multiplication = new Text(2, 4); //конструктор с параметрами для умножения
        System.out.println(multiplication.multiplication());

        Text main = new Text(); //конструктор без параметра (параметры в функции)
        System.out.println(main.division(8, 2));
        System.out.println(main.welcome("Sergei", "Nagovitsyn"));

        Text sum = new Text(5.0, 7.0);
        System.out.println("Сумма чисел " + sum.f + " и " + sum.g + " равна " + sum.sum());

        EvenOddNumbers evenOddNumbers = new EvenOddNumbers();
        System.out.println(evenOddNumbers.checkEven(245));

        Multiple multiple = new Multiple();
        System.out.println(multiple.multipleNumbers());

        int i = 535;  //from Int to String (numbers only)
        String s = Integer.toString(i);
        System.out.println(s);

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println(name);
    }
}
