package Task_27_june;

import java.util.Scanner;

public class Website_Type_Checker {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(("enter the input"));
         String url=sc.nextLine().toLowerCase();

         if(url.endsWith(".com"))
         {
             System.out.println("The website type is: Commercial website");
         }
         else if(url.endsWith(".org"))
         {
             System.out.println("The website type is: Non-profit organization");
         }
         else if(url.endsWith(".edu"))
         {
             System.out.println("The website type is: Educational institution");
         }
         else if(url.endsWith(".gov"))
         {
             System.out.println("The website type is: Government website");
         }
         else if(url.endsWith(".net"))
         {
             System.out.println("The website type is: Network-related website");
         }
         else if(url.endsWith(".info"))
         {
             System.out.println("The website type is: Informational website");

         }
         else if (url.endsWith(".xyz"))
         {
             System.out.println("The website type is: Unknown or other types of websites");

         }
         sc.close();

    }
}
