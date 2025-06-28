package Task_27_june;

import java.util.Scanner;

public class Age_categary_checker {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        int age= 0;
        if(!sc.hasNextInt())
        {
            System.out.println("Enter the correct value");
        }
        else {
            age=sc.nextInt();
        }

        if (age < 0)
         {
             System.out.println("Enter the positive value");
        }
        else if(age<=12)
        {
            System.out.println("child");
        }
        else if (age<=19)
        {
            System.out.println("teenage");
        }
        else if (age<=64)
        {
            System.out.println("adult");
        }
        else if(age<65)
        {
            System.out.println("older");
        }


    }
}
