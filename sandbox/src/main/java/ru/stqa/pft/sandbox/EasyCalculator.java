package ru.stqa.pft.sandbox;

import java.util.Scanner;

public class EasyCalculator {

    public static int first;
    public static int second;

    public static int inputFirst() {
        System.out.println("Введите первое число:");
        Scanner console = new Scanner(System.in);
        return console.nextInt();
    }

    public static int inputSecond() {
        System.out.println("Введите второе число:");
        Scanner console = new Scanner(System.in);
        return console.nextInt();
    }

    public static int firstNumber(int first) {
        return EasyCalculator.first = first;
    }

    public static int secondNumber(int second) {
        return EasyCalculator.second = second;
    }

    public static int sum(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println(first + " + " + second + " = " + sum(firstNumber(inputFirst()), secondNumber(inputSecond()))+second);
    }
}
