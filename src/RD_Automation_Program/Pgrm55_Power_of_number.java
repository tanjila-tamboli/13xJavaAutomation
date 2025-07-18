package RD_Automation_Program;

import java.util.Scanner;

public class Pgrm55_Power_of_number {
    public static void main(String[] args) {

        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the base value");
        int base=s1.nextInt();

        Scanner s2= new Scanner(System.in);
        System.out.println("Enter the power value");

        int power= s2.nextInt();
        int result= 1;

        for( int i=1; i<=power; i++ )
        {
            result= result*base;
        }
        System.out.println(result);
    }
}
