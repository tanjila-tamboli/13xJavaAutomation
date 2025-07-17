package Task_15_july_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class prgm6_Group_Words_by_Length_Using_Map {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "fun", "cool", "Hi"};

        // Key: word length (Integer)
        // Value: list of words having that length (List<String>)
        Map<Integer, List<String>> mapLength = new HashMap();

        // Loop through each word in the input array
        for (String word : words) {
            int length = word.length(); // Get the length of the current word

            //Check if the map already has this length as a key
            if (mapLength.containsKey(length)) {
                //if key exists, get the existing list and add the word,
                mapLength.get(length).add(word);
            }
            else{
                    // If key does NOT exist, create a new list and put in map
                    List<String> newList = new ArrayList<>();
                    newList.add(word); // Add the current word to the new list
                    mapLength.put(length, newList); // Put length and list into map
                }
        }
        //Use Map.Entry to loop through each (length, word list) pair
        for(Map.Entry< Integer, List<String>> entry: mapLength.entrySet())
        {
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }
        }
    }
    
