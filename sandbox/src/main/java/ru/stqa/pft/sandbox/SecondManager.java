package ru.stqa.pft.sandbox;

import java.util.Arrays;

public class SecondManager {

    private static ApplicationManager app;

    public SecondManager(ApplicationManager app) {
        SecondManager.app = app;
    }

    public static String inputData(int id, String name, String surname) {

        ApplicationManager app = new ApplicationManager().withId(id).withName(name).withSurname(surname);
        String name1 = app.getName();
        System.out.println(name1);
        return app.fullText();
    }

    public static String getName() {
        ApplicationManager app = new ApplicationManager().withName("test_name");
        return app.getName();
    }

    public static String[] inputData2(int id, String name, String surname) {

        ApplicationManager app = new ApplicationManager().withId(id).withName(name).withSurname(surname);
        return app.asMassive();
    }

    public static String showSurname() {
        System.out.println(app.getSurname());
        return app.getSurname();
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println(inputData(1, "Sergei", "Nagovitsyn"));
        System.out.println(inputData(1, "Sergei", "Nagovitsyn").contains("Sergei Nagovitsyn"));
        System.out.println(getName());
        //System.out.println(showSurname());


        System.out.println(Arrays.toString(inputData2(1, "Sergei", "Nagovitsyn")));
        String[] s = inputData2(1, "Sergei", "Nagovitsyn");
        System.out.println(s[0]);
    }
}
