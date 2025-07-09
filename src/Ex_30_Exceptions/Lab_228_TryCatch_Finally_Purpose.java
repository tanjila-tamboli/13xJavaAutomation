package Ex_30_Exceptions;

import java.util.Scanner;

public class Lab_228_TryCatch_Finally_Purpose {
    public static void main(String[] args) {


        Scanner s = null;
               s= new Scanner(System.in);
        System.out.println("Enter the v");
        int v = s.nextInt();
        try {
            int b= 10/v;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            s.close();
            System.out.println("end of program");
        }
    }
}