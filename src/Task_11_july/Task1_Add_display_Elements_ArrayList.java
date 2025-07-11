package Task_11_july;

import java.util.ArrayList;

public class Task1_Add_display_Elements_ArrayList {
    public static void main(String[] args) {
        ArrayList l1= new ArrayList();

        l1.add("Dipak");
        l1.add("ravi");
        l1.add("shenha");
        l1.add("priya");
        l1.add("Anjali");
        System.out.println(l1);
        System.out.println("=======");
        for(int i=0; i<l1.size(); i++)
        {
            System.out.println(l1.get(i));
        }

    }
};
