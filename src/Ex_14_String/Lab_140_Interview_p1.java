package Ex_14_String;

public class Lab_140_Interview_p1 {
    public static void amin(String args[])
    {
        String s="Hello";
         String s1="Hello";
         String s2= "Hello";


         String s3= new String("Hello");
         String s4 = new String ("Hello");
         String s5= new String ("hello");

       // String pool objects: 2 ("Hello", "hello")
      //  Heap objects: 3 (from new String() calls)
     //   Total String objects create 5
    }
}
