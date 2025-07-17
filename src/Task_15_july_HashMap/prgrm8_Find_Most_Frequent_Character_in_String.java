package Task_15_july_HashMap;
import java.util.HashMap;
public class prgrm8_Find_Most_Frequent_Character_in_String {


        public static void main(String[] args) {

            // Input string
            String input = "aaaabbbcc";

            // Create HashMap to count characters
            HashMap<Character, Integer> map = new HashMap<>();

            // Count each character
            for (char ch : input.toCharArray()) {
                // Add or update count
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            // Variables to store most frequent character and count
            char maxChar = ' ';
            int maxCount = 0;

            // Find the character with highest frequency
            for (char ch : map.keySet()) {
                int count = map.get(ch);
                if (count > maxCount) {
                    maxChar = ch;
                    maxCount = count;
                }
            }

            // Print result
            System.out.println("Most frequent character is: " + maxChar + " (" + maxCount + " times)");
        }
    }

