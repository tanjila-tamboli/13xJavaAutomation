package RD_Automation_Program;

import java.util.Scanner;

public class Prgm51_Remove_White_Space {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
       String input =sc.nextLine();
        String noSpace=input.replaceAll("//s+" ,"");

    }
}
