package RD_Automation_Program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prgm53_Find_Position_Of_Word_From_String {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sentence=sc.nextLine();

        System.out.println("Enter the word");
        String word= sc.nextLine();

        String LowerSentence=  sentence.toLowerCase();
        String LowerWord= word.toLowerCase();

        int index= LowerSentence.indexOf(LowerWord);

        if(index!=-1)
        {
            System.out.println("The word starts at character index: " + index);
        }
        else {
            System.out.println("word not found");
        }






    }
}
