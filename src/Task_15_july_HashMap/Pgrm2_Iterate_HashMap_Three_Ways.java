package Task_15_july_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Pgrm2_Iterate_HashMap_Three_Ways {
    public static void main(String[] args) {

        HashMap<String ,String> map= new HashMap<>();
        map.put("Name","Tanjila");
        map.put("Role", "Tester");
        map.put("Level", "Senior");

        System.out.println("1. entrySet()");
        for(Map.Entry<String, String> Entry: map.entrySet() )
                {
                    System.out.println(Entry.getKey() +" ->" +Entry.getValue());
                }

        System.out.println("2.keySet()");
        for(String key: map.keySet())
        {
            System.out.println(key +"->" +map.get(key));
        }

        System.out.println("3.Using Iterator");

       Iterator<Map.Entry<String ,String>> itr= map.entrySet().iterator();
       while(itr.hasNext())
       {
           Map.Entry<String, String> entry = itr.next();
           System.out.println(entry.getKey() + " -> " + entry.getValue());
       }
    }

}
