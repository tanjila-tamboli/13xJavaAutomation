package Ex_09_Operators;

public class Lab_41_Logical_Operator {
    public static void main(String [] args)

    {
        boolean a = true;
        System.out.println(!a); //!a means NOT true, which is false.

        boolean b = true;
        System.out.println(!!b); //!!b means NOT (NOT true) → which is still true.

        boolean c= true || false;
        System.out.println(c); //true || false → if any one is true, the result is true.

        boolean d = true && false;
        System.out.println(d);

    }
}
