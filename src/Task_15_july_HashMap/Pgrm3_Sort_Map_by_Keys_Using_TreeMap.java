package Task_15_july_HashMap;

import java.util.Map;
import java.util.TreeMap;

public class Pgrm3_Sort_Map_by_Keys_Using_TreeMap {
    public static void main(String[] args) {
        Map<String , Integer> map= new TreeMap<>();
        map.put("Ravi" ,80);
        map.put("Anjali", 95);
        map.put("Dipak", 75);

        // Create a TreeMap and pass HashMap to it
        // This automatically sorts the data by keys (names)
        TreeMap<String, Integer> sortedMap= new TreeMap<>(map);

        //Print the sorted map
        for(Map.Entry<String , Integer> entry: sortedMap.entrySet())
        {
            // entry.getKey() returns the name, entry.getValue() returns the marks
            System.out.println(entry.getKey() +"="+ entry.getValue());
        }

    }
}
