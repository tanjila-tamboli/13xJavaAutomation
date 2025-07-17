package Task_15_july_HashMap;

import java.util.HashMap;

public class prgm_7_Filter_Students_by_Name_Starting_with_A {
    public static void main(String[] args) {

        HashMap<Integer , String> students= new HashMap<>();
        students.put(101, "Anjali");
        students.put(105, "Anjali");
        students.put(102, "Dipak");
        students.put(103, "Aman");
        students.put(104, "Ravi");

        // Print only names that start with 'A'
        System.out.println("Names starting with 'A':");


        for(Integer roll: students.keySet())
        {
            String Name= students.get(roll);
            if(Name.startsWith("A"))
            {
                System.out.println(roll + " -> " + Name);
            }
        }


    }
}
