package Ex_32_Collection_Framework_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_251_Use_Input_AL {
    public static void main(String[] args) {
        ArrayList <String> s1= new ArrayList<>();
        ArrayList<Integer> s2= new ArrayList<>();

        Scanner sc= new Scanner(System.in);
        String continueInput = "Y"; // Control variable for input loop
        while(continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name");
             String name=sc.next();
             s1.add(name);

            System.out.println("Enter the age");
            Integer age = sc.nextInt();
            s2.add(age);

            sc.nextLine();
            System.out.print("Do you want to enter another record? (Y/N): ");
            continueInput = sc.nextLine();

        }
        for(Object o1: s1)
        {
            System.out.println(o1);
        }
        for(Object o2: s2)
        {
            System.out.println(o2);
        }
        sc.close();




    }
}
