package Ex_32_Collection_Framework_DSA;

import java.util.LinkedList;
import java.util.List;

public class Lab_245_LinkedList {
    public static void main(String[] args) {
        List<String> l1= new LinkedList();
        l1.add("Tanjila");
        l1.add("Tamboli");
        l1.add("Orhan");
        l1.add("Shaikh");
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());

        LinkedList<String> animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Camel");
        animals.add("Elephant");
        System.out.println(animals);
        System.out.println(animals.size());
        System.out.println(animals.contains("ant"));
        System.out.println(animals.get(2)); // get index value
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());
        System.out.println(animals.removeFirst());
        System.out.println(animals.removeLast());
        System.out.println("LinkedList after removal: " + animals);

        System.out.println("Size of LinkedList: " + animals.size());

    }
}
