package RD_Automation_Program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prgm50_Find_SubString_From_String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String input= sc.nextLine();
        for(int i=0; i<input.length(); i++)
        {
            for(int j=i+1; j< input.length(); j++)
            {
                String sub = input.substring(i, j);
                System.out.println(sub);
            }

        }

    }
}
