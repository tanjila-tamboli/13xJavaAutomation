package Task_11_july;

import java.util.ArrayList;

public class Task2_Remove_Element_ArrayList {
    public static void main(String[] args) {
        ArrayList<String>  a1= new ArrayList<>();
        a1.add("Amit");
        a1.add("Neha");
        a1.add("Suresh");
        System.out.println(a1);
        a1.remove("neha");
        a1.remove(1);
        System.out.println(a1);


    }
}
