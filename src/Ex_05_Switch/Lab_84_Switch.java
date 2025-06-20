package Ex_05_Switch;

import java.util.Scanner;

public class Lab_84_Switch {
    public static void main(String[] args) {
        // Take a user input and tell them the day which they have told.
        // 1 to 7 ,1 =mon, 5 = fri
        // 8 ? - Not allowed or error
        System.out.println("enter the value");
       Scanner scanner= new Scanner(System.in);
      int day= scanner.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("Thu");
                 break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("Sat");
                break;

            case 7:
                System.out.println("sun");
                break;
            default :
                System.out.println("not allowed");
                break;


        }
    }
}
