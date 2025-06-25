package Ex_14_String;

public class Lab_143_String_Function {
    public static void main(String args[])
    {
        String s= "Tanjila";
        System.out.println(s.length()); //7
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.print(s.charAt(4));
        System.out.print(s.charAt(5));
        System.out.print(s.charAt(6));

        //concat
        System.out.println(s.concat("Tamboli"));

        //contains
        System.out.println(s.contains("ji"));

        // equals
        System.out.println(s.equals("Tanjila"));

        //equalsIgnoreCase
        System.out.println(s.equalsIgnoreCase("Tanjila"));

         // indexOf
        System.out.println((s.indexOf("j")));

        String s1 = "Orhan";
        System.out.println(s1.indexOf("h"));

        // length
        System.out.println(s.length());
        System.out.println(s1.length());

        //replace
        System.out.println(s.replace("Tanjila" ," noushad"));
        System.out.println(s1.replace("Orhan" ,"Shaikh"));

        //split
        String s3= "tanjila.tamboli704@hmail.com";
        String[] split3= s3.split("@");
        System.out.println(split3[0]);
        System.out.println(split3[1] );

        String name4 = "pramod@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        //subString
        System.out.println(s.substring(1, 3));
        System.out.println((s.substring(0,3)));

        //to UpperCase
        System.out.println(s.toUpperCase());
        System.out.println((s1.toUpperCase()));

        //to lowerCase
        System.out.println(s.toLowerCase());
        System.out.println(s1.toLowerCase());

        //start with
        System.out.println(s.startsWith("T"));
        System.out.println(s.startsWith("r"));

        //end with
        System.out.println(s.endsWith("a"));
        System.out.println(s.endsWith("h"));
        //        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));
    }
}
