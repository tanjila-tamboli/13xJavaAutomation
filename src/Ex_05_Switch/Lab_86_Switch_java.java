package Ex_05_Switch;

import java.util.Scanner;

public class Lab_86_Switch_java {
    public static void main(String args[]) {
        System.out.println("enter the value");
        Scanner s = new Scanner(System.in);
        String day = s.next();
        int day1 = s.nextInt();
        // my approch
        switch (day) {
            case "mon":
                System.out.println("mon");
                break;
            case "thu":
                System.out.println("thu");
        }

        //
        switch (day1) {

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;

        }
    }
}
