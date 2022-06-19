package ru.stqa.pft.sandbox;

public class Solution {

    public static void main(String[] args) {
        String string = "12.84";

        double num = Double.parseDouble(string);
        System.out.println(num);
        long x = Math.round(num);
        System.out.println(x);
    }
}
