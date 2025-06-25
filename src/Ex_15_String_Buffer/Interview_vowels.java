package Ex_15_String_Buffer;

import java.util.Scanner;

public class Interview_vowels {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
        String input = s.next();
        input = input.toLowerCase();

       // int v= vowels;
      //  int c= consonants;


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch +" is vowels");
            } else {
                System.out.println(ch+ " is consonant");
            }
        }
    }
}

