package Task_27_june;

import java.util.Scanner;

public class pyramid {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of rows");
       int n= sc.nextInt();
       for(int i=0; i<=n; i++)
       {
           //print space
           for(int space= 1; space<=n-1; space++)
           {
               System.out.print(" ");
           }
           for( int star=1; star<=2*i-1; star++)
           {
               System.out.print(" *");
           }
           System.out.println();
       }
       sc.close();
    }
}
