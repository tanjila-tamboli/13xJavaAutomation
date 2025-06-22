package Ex_10_TypeCasting;

public class Lab_59_TypeCasting {
    public static void main(String[] args) {
        int val= 300;
        byte b=(byte) val;
        System.out.println(b);// loss data


        int i = 5300;
//        byte b = i; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte b1 = (byte)i; // Narrowing (int -> byte) - Explicit Casting is not allowed.
        // Data Loss.
        System.out.println(b1);
    }

    }
