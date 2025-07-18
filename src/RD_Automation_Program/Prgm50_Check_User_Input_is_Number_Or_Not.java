package RD_Automation_Program;

import java.util.Scanner;

public class Prgm50_Check_User_Input_is_Number_Or_Not {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");

        if(sc.hasNextDouble())
        {
            double num= sc.nextDouble();
            System.out.println(num);
        }
        else {
            System.out.println("not a number");
        }

    }
}
