package Task_15_july_HashMap;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class prgm5_Find_First_Non_Repeated_Character {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         String input= sc.nextLine();
         input= input.toLowerCase();

        LinkedHashMap<Character , Integer> map= new LinkedHashMap();

        for(char ch : input.toCharArray())
        {
            map.put( ch, map.getOrDefault(ch ,0)+1);
        }

        for(char ch: map.keySet())
        {
            if(map.get(ch)==1)
            {
                System.out.println("First non-repeated character is:" + ch);
                return;
            }
        }
        System.out.println("No non-repeated character found.");
    }
    }
