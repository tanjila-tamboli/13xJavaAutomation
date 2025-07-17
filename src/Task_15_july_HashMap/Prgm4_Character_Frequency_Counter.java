package Task_15_july_HashMap;

import java.util.HashMap;

public class Prgm4_Character_Frequency_Counter {
    public static void main(String[] args) {
        String input= "aabbccddeeff";

        HashMap<Character,Integer> map= new HashMap<>();

        for(char ch:input.toCharArray() )
        {
            map.put(ch, map.getOrDefault(ch, 0) +1);

            }
            for (char key : map.keySet()) {
                System.out.println(key + " -> " + map.get(key));

        }
            }



        }




