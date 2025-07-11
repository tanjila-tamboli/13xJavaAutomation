package Ex_32_Collection_Framework_DSA;

import java.util.Iterator;
import java.util.Vector;

public class Lab_247_Vector {
    public static void main(String[] args) {

        Vector v = new Vector();
        Vector v1 = new Vector(10);

        v1.add("Tanjila");
        v1.add("Tamboli");
        v1.add(133456);
        v1.add(null);
      //  v1.remove(0);
       // v1.remove("Tamboli");
        System.out.println(v1.contains("Tanu"));
        System.out.println(v1);

        for (int i = 0; i < v1.size(); i++) {
            System.out.println(v1.get(i));
        }


        System.out.println(" ----  For  Each Loop ");

        for (Object o : v1) {
            System.out.println(o);
        }

        System.out.println(" ----  Iterator ");

        Iterator i1=v1.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }

    }
}
