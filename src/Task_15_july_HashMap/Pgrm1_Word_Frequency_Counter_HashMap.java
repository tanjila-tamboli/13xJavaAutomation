package Task_15_july_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Pgrm1_Word_Frequency_Counter_HashMap {

    public static void main(String[] args) {
        String input="java is easy and java is powerful";

        //Convert the input to lowercase to make it case-insensitive
        input= input.toLowerCase();

      //  Split the sentence into words using space (" ") as separator
        String[] words=input.split(" ");

        Map<String ,Integer> wordCount= new HashMap<>();



        for(String word:words )
        {
            //Get current count using getOrDefault (0 if not present), then add 1
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        //Loop through all keys (words) in the map and print their counts
        for(String word: wordCount.keySet())
        {
            System.out.println((word + " -> " + wordCount.get(word)));
        }
    }
}
