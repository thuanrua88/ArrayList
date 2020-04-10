package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steven");
        names.add("John");
        names.add("Steven");
        names.add("Maria");

        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));
        System.out.println("Index of \"Steven\": " + names.indexOf("Steven"));
        System.out.println("Index of \"Mark\": " + names.indexOf("Mark"));
        System.out.println("Last index of \"John\": " + names.lastIndexOf("John"));
        System.out.println("Last index of \"Bill\": " + names.lastIndexOf("Bill"));
    }
}
