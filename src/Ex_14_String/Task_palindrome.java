package Ex_14_String;

import java.util.Scanner;

public class Task_palindrome {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value");
       String input= s.nextLine();

        String original= input.replaceAll("[^A-Za-z]","").toLowerCase();

        String reversed= "";

        for(int i= original.length()-1; i>=0; i--)
        {
            reversed= reversed+ original.charAt(i);
        }

        if(reversed.equals(original))
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
