package Ex_05_Switch;

import java.util.Scanner;

public class Lab_85_Switch_without_Break {

    public static void main(String[] args) {

        System.out.println("Enter the value");
        Scanner s= new Scanner(System.in);
        int day=  s.nextInt();

        switch  (day) {

            case 1:
                System.out.println("mon");
            case 2:
                System.out.println("tue");
            case 3:
                System.out.println("wed");
            case 4:
                System.out.println("thu");
            case 5:
                System.out.println("fri");
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sun");
            default :
                    System.out.println("not");
        }


    }
}
