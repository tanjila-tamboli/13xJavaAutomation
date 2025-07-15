package Ex_32_Collection_Framework_DSA;

import java.util.ArrayList;
import java.util.List;

public class Lab_249_NestedArrayList {
    public static void main(String args[])
    {
        List<String> fruits= new ArrayList();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Apple");
        System.out.println(fruits);

        List fruits2 = new ArrayList();
        fruits2.add("Papaya");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List <String> veggi= new ArrayList<>();
        veggi.add("tamato");
        veggi.add("patato");
        veggi.add("onion");
        System.out.println(veggi);

        List all_fruits= new ArrayList();
        all_fruits.add(fruits);
        all_fruits.add(veggi);
        all_fruits.add(fruits2);
        System.out.println(all_fruits);

    }
}
