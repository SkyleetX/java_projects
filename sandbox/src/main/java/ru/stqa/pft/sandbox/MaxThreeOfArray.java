package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxThreeOfArray {

    public static List<Integer> list = Arrays.asList(-10, -7, 3, 4, 9, -7, 3, 4, 9);

    public static int getResult(List<Integer> array) {

        if (array.size() >=3 && array.size() < 15) {
            for (int i = 0; i <= array.size(); i++) {
                if (array.get(i) > 10 || array.get(i) < -10) {
                    return 404;
                }
                Collections.sort(array, Collections.reverseOrder());
                System.out.println(array);
                return array.get(0) * array.get(1) * array.get(2);
            }
        } return 0;
    }

    public static void main(String[] args) {
        System.out.println(getResult(list));
    }
}
