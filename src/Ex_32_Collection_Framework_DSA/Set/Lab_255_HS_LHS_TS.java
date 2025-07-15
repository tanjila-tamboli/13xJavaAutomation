package Ex_32_Collection_Framework_DSA.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class Lab_255_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        // Hashing mechanism to store the element
        // no order maintained
        // no duplicates
        // e1 -> hashcode (xyz), e2 -> hashcode -> abc

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        System.out.println(hs);

        for (String s : hs) {
            System.out.println(s);
        }
        System.out.println(" ---------------------------");

        Iterator iterator = hs.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(" ---------------------------");

        Set<String> lhs = new LinkedHashSet<>();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println(" ---------------------------");
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        //ts.add(123);
        // ts.add(null);

        System.out.println(ts);

        System.out.println(" ----- For Each ---- ");

        for (Object o : ts) {
            System.out.println(o);
        }
    }
}

