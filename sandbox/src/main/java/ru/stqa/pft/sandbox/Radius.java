package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;

public class Radius {

    public static List<Integer> list = Arrays.asList(3, 4);

    //public static int[] i = {5, 5};
    public static int r = 5;

    public static boolean getResult(List<Integer> i, int r) {

        //return i[0];
        //List<Integer> d = Arrays.asList(3, 4);
        //System.out.println(list.get(0));

        double c2 = i.get(0) * i.get(0) + i.get(1) * i.get(1);
        double c = Math.sqrt(c2);
        System.out.println(c);

        if (c <= r) {
            return true;
        } else return false;

        //(new int[]{3, 2}, 4)
    }

    public static void main(String[] args) {
        System.out.println(getResult(list, r));
    }
}
