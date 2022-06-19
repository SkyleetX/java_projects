package ru.stqa.pft.sandbox;

import com.google.common.base.CharMatcher;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTransformation {

    public static String getResult(String formula) {

        return formula;
        //"bbfgfgfg"
    }

    public static String getInt() {
        //return Integer.parseInt("42").filter(s -> s.matches("^-?\\d+$"));
        return CharMatcher.digit().retainFrom ("xx123xx");

    }

    public static Integer getInt2() {
        String s = "123";
        Integer i = Integer.parseInt(s);
        return i;
    }
    public static void main(String[] args) {
        System.out.println(getResult("2{b}3{fg}"));
        System.out.println(getInt());
        System.out.println(getInt2());

        String text = "(слива) какие-то другие слова [яблоко], еще слова {груша}. 22{b}3{fg}";
        Pattern pattern = Pattern.compile("[\\{](.*?)[\\}]");
        Matcher matcher = pattern.matcher(text);
        List<String> lst = new ArrayList<>();
        while (matcher.find()) {
            lst.add(matcher.group(1));
        }
        int n = 3;
        for (int i=0; i<n; i++) {
            String list = lst.get(i) + lst.get(i);
            System.out.println(list);
        }
        System.out.println(lst);
    }

    public static String plusWord(int a) {

        return null;
    }

}

