package Ex_29_Wrapper_class;

public class Lab_213_Wrapper_conversion {
    public static void main(String[] args) {


        int a =10;
        Integer b = a;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b.intValue());


        Integer a2 = 42;
        int v = a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(v);
    }
}