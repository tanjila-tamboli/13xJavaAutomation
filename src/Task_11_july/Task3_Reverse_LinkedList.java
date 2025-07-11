package Task_11_july;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task3_Reverse_LinkedList {
    public static void main(String[] args) {

        LinkedList l1= new LinkedList();
       // List l1= new LinkedList();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println("before reverse:" +l1);
       // approch 1
        System.out.println( l1.reversed());

        //Approch2
        Collections.reverse(l1);
        System.out.println(l1);

         //Approch3
       /* for(int i=l1.size()-1; i>0; i-- )
        {
            System.out.println(" after reverse:" +l1.get(i));
        }*/

    }
}
