package Task_25_june;

import java.util.Scanner;

public class Bonus_Calculator {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary=sc.nextDouble();
        System.out.println("enter the experience");
        double expe= sc.nextDouble();
        double bonus= 0;
        if(expe<1 )
        {
            System.out.println("No bonus for less than 1 year of experience.");
        }
        else if(expe>=1 && expe<=3)
        {
            bonus= salary*0.05;
        }
        else if(expe>=4 && expe <=6)
        {
            bonus= salary*0.10;
        }
        else if(expe>=6)
        {
            bonus = salary*0.15;
        }
        if(expe>=1){
            System.out.println(bonus);
        }
        sc.close();

    }
}
