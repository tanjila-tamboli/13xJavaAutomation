package Ex_03_UserInput;


import java.util.Scanner;

public class Lab_04_UserInput_Scanner1 {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner= new Scanner(System.in);
         String s=scanner.next();
         System.out.println(s);

        System.out.println("Enter the int");
        int age= scanner.nextInt();
        System.out.println(age);

        System.out.println("Enter the double");
        Double d=scanner.nextDouble();
        System.out.println(d);
        }
}
