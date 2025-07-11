package Ex_32_Collection_Framework_DSA;

import java.util.LinkedList;
import java.util.List;

public class Lab_244_LinkedList {
    public static void main(String[] args) {
        List l1= new LinkedList();

        l1.add("Tanjila");
        l1.add("Tamboli");
        l1.add(null);
        l1.add(123456);
        System.out.println(l1);
        System.out.println(l1.size());

    }
}
