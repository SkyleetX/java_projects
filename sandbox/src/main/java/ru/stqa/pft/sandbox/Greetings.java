package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Greetings {

    public static String enterName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String randomElement() {
        List<String> givenList = Arrays.asList("Доброе утро, ","Добрый день, ", "Добрый вечер, ");
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }

    public static void main(String[] args) {
        System.out.println(randomElement() + enterName());
    }
}
