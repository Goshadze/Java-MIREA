package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 3));
        System.out.println("Было:             " + list);
        System.out.println("Без повторов:     " + Algorithms.removeDuplicates(list));

        String[] animals = {"кот", "пёс", "рыба", "птица"};
        System.out.println("Позиция 'рыба':   " + Algorithms.linearSearch(animals, "рыба"));
        System.out.println("Позиция 'олень':  " + Algorithms.linearSearch(animals, "олень"));

        Circle[] circles = {new Circle(3), new Circle(7), new Circle(5)};
        System.out.println("Наибольший круг:  " + Algorithms.max(circles));

        Integer[][] table = {{4, 9, 2}, {7, 1, 6}};
        System.out.println("Максимум в 2x3:   " + Algorithms.max(table));
    }
}
