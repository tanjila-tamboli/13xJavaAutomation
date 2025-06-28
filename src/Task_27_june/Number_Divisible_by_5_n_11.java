package Task_27_june;

import java.util.Scanner;

public class Number_Divisible_by_5_n_11 {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value");
        int n=  s.nextInt();
       if(n%5==0 && n%11==0)
       {
           System.out.println(n +" is divied by both 5 and 11");
       }
       else
           System.out.println((n+" is not divied by 5 and 11"));
    }
}
