package Task_25_june;

import java.util.Scanner;

public class Travel_based_on_age_visa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
       /* sc.nextLine();
        System.out.println("Enter visa status (valid/invalid):");
        String visa = sc.nextLine().toLowerCase();

        if (age < 0) {
            System.out.println("enter the positive value");
        } else if (age >= 18 && visa.equals("valid")) {
            System.out.println("You are eligible to travel.");
        } else {
            System.out.println("You are not eligible to travel.");
        }
        sc.close();*/


        // Input visa status as true or false
        System.out.print("Is your visa valid? (true/false): ");
        boolean visaValid = sc.nextBoolean();

        // Validation and Eligibility Check
        if (age < 0) {
            System.out.println("Invalid age. Please enter a positive number.");
        } else if (age >= 18 && visaValid) {
            System.out.println("✅ You are eligible to travel.");
        } else {
            System.out.println("❌ You are not eligible to travel.");
        }
    }
}