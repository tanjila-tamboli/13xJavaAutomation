package RD_Automation_Program;

import java.util.Scanner;

public class Prgm52_Get_Capital_Letters_From_Given_String {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input=sc.nextLine();

        String capitalLetters = "";

        for(int i=0; i<input.length(); i++)
        {
            char ch= input.charAt(i);

            if(Character.isUpperCase(ch))
            {
             capitalLetters=capitalLetters+ch;
            }


        }
        System.out.println(capitalLetters);
    }
}
