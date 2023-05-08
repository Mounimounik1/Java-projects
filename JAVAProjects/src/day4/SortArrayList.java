package day4;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("pear");
        list.add("orange");
        list.add("grape");

        System.out.println("Before sorting: " + list);

        Collections.sort(list, (a, b) -> a.compareTo(b));

        System.out.println("After sorting: " + list);
    }
}
