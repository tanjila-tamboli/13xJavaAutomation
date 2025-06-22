package Ex_09_Operators;

public class Lab_45_Equal {
    public static void main(String args[])
    {
        int a=65;
        int b=55;
        System.out.println(a==b);

        System.out.println(10==10);
        System.out.println(10>=9);
        /*Is 10 greater than 9? ✅ Yes Is 10 equal to 9? ❌ No
        But remember — it only needs one of them to be true.
            Since 10 is greater than 9, the condition is true, even though it’s not equal.*/

        System.out.println(10<=9);
        System.out.println(10!=9);


    }
}
