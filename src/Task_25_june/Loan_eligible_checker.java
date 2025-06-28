package Task_25_june;

import java.util.Scanner;

public class Loan_eligible_checker {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();

        System.out.println("enter the salary");
        double salary= sc.nextDouble();

        System.out.println("Enter credit score");
         int credit_score= sc.nextInt();

         // age validation
         if(age<0)
         {
             System.out.println("enter the positive value");
         }
         else if(age<18)
         {
             System.out.println("You must be at least 18 years old to apply for a loan");
         }
         else if(age>80)
         {
             System.out.println("Maximum age limit is 80 years");
         }
         //
        else if(salary<0)
         {
             System.out.println("positive salary");
         }
        else if(salary<30000)
         {
             System.out.println("Minimum salary requirement is ₹30,000.");
         }

        //credit score validation
        else if(credit_score<0)
         {
             System.out.println("enter the positive score");
         }
        else if(credit_score<350)
         {
             System.out.println("min score is 350");
         }
         else if(credit_score>850)
         {
             System.out.println("max score is 850");
         }
         else {
             System.out.println("eligible for loan ");
         }
         sc.close();

    }
}
