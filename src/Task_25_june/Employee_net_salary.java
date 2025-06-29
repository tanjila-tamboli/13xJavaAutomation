package Task_25_june;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Employee_net_salary {
    // // Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,) Reserch from your side for this program.

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the basic");
       double basic= sc.nextDouble();

       //HRA	House Rent Allowance	20%
        //DA	Dearness Allowance (inflation offset)	10%
        //PF	Provident Fund (employee retirement saving)	12%
        //Tax	Income Tax (example: flat 10% for simplicity)	10%
       // Gross Salary = Basic + HRA + DA
      //  Total Deductions = PF + Tax
      //  Net Salary = Gross Salary - Total Deductions

        //Allowance
        double HRA= basic*0.20;
        double DA= basic*0.10;

        //deduction
        double PF= basic*0.12;
        double TAX= basic*0.10;

      double   Gross_Salary= basic+HRA+DA;
      double Total_Deductions= PF+TAX;
      double Net_Salary= Gross_Salary-Total_Deductions;

        System.out.println("Basic:" + basic);
        System.out.println("HRA:" +HRA);
        System.out.println("DA:" +DA);
        System.out.println("PF:" +PF);
        System.out.println("TAX:"+TAX);
        System.out.println("Gross_salary:"+Gross_Salary) ;
        System.out.println("Total_Deductions:" +Total_Deductions);
        System.out.println("Net_salary:" +Net_Salary);


    }

}
