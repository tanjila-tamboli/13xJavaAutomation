package Ex_32_Collection_Framework_DSA;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab_248_Vector_ListIterator {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");

        ListIterator listiterator = vector.listIterator();
        while (listiterator.hasNext()) {
            System.out.println(listiterator.next());
        }

        while (listiterator.hasPrevious()) {
            System.out.println(listiterator.previous());
        }
        System.out.println(" --- ");

        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
