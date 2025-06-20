package Ex_07_WhileLoop;

import java.util.Scanner;

public class Lab_121_Factorial {
    public static void main(String args[])
    {
       Scanner s= new Scanner(System.in);
        System.out.println("enter the value");
        if(!s.hasNextInt())
        {
            System.out.println(" you fool, enter the int value");
            return;
        }
        int number=s.nextInt();
                long factorial =1;;

if(number<0)
{
    System.out.println("number is negative");
    return;
}
/*if(number<=0)
{
    System.out.println(factorial);
}*/
else{
    for(int i=0; i<=number; i++)
    {

        factorial= factorial*1;
    }



    }
        System.out.println(factorial);
    }
}
