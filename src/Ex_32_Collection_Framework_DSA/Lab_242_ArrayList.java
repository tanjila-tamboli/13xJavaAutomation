package Ex_32_Collection_Framework_DSA;

import java.util.ArrayList;
import java.util.List;

public class Lab_242_ArrayList {
    public static void main(String[] args) {
        ArrayList l1= new ArrayList();
        l1.add("orhan");
        l1.add("Noushad");
        l1.add("Shaikh");
        l1.add("12345");
        l1.add(123456);
        l1.add(null);

        System.out.println(l1);
        System.out.println(l1.size());

        List l2= new ArrayList();
        l2.add("Tanjila");
        l2.add("Tamboli");
        l2.add("123456");
        l2.add(null);
        l2.add("Tanjila");
        System.out.println(l2);
        System.out.println(l2.isEmpty());

        List l3 = new ArrayList();
        System.out.println(l3.isEmpty());



    }
}
