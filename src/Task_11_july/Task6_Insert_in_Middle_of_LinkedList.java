package Task_11_july;

import java.util.LinkedList;

public class Task6_Insert_in_Middle_of_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Fruits List:" + fruits);
        // insert
        fruits.add(1, "Orange");
        System.out.println("Fruits List:" + fruits);
    }
}
