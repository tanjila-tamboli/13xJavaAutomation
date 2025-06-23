package Ex_14_String;

import java.sql.SQLOutput;

public class Lab_141_String_interview {
    public static void main(String args[])
    {
        String s1= "Hello";
        String s2= "Hello";

        String s3= new String("Hello");
        String s4 = new String ("Hello");
        String s5 = new String ("hello");


        // == -> Comparsion -> String -> this check the locations ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);
        System.out.println("==================");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));



    }
}
