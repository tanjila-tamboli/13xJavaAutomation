package Ex_03_UserInput;


import java.util.Scanner;

public class Lab_03_UserInput_scanner {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value");
        int age =  scanner.nextInt();
        String canIVote = age>=18?"yes" :"No";
        System.out.println(canIVote);





    }
}
