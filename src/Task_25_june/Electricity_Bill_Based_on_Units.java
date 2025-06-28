package Task_25_june;

import java.util.Scanner;

public class Electricity_Bill_Based_on_Units {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of units consumed: ");
       int units= sc.nextInt();
        double bill= 0;

        if(units<=0)
        {
            System.out.println("enter the positive ");
        }
        else if (units<=100)
        {
            bill = units * 0.50;
        }
        else if(units<=200)
        {
            bill = 100 * 0.50 + (units - 100) * 0.75;
        }
        else if(units<=300)

        {
            bill = 100 * 0.50 + 100 * 0.75 + (units - 200) * 1.20;
        }
        else {
            bill = 100 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 300) * 1.50;
        }
        if (units > 0) {
            System.out.println("Total electricity bill for " + units + " units is: ₹" + bill);
        }

        sc.close();
    }
}
