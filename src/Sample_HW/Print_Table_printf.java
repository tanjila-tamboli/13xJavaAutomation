package Sample_HW;

import java.util.Scanner;

public class Print_Table_printf {
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        int n= s.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d x %d= %d\n", n,i,n*i  );
        }

    }
}

