package Task_27_june;

import java.util.Scanner;

public class Convert_Days_into_yrs_month_days {
   public static void main(String args[])
    {
            Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Value");
        int total_days=0;
        if(!sc.hasNextInt())
        {
            System.out.println("Enter the correct value");
        }
        else
        {
            total_days= sc.nextInt();
        }

        if(total_days<0)
        {
            System.out.println("Enter the positive value");
        }
        else
        {
             int year= total_days/365;
            int  remaining_days= total_days%365;
             int months= remaining_days/30;
            int days= remaining_days%30;
            System.out.println("Total: "+year+"Y " +months+"M " +days+"D");
        }

    }
}
