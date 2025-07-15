package Task_14_july_Increment_Decrement;

public class Program7 {
    public static void main(String[] args) {


        int a = 110; // a is initialized to 110

        int b = a--; // Post-decrement: b = 110, then a becomes 109

        System.out.println("the value of b is " + b); // Output: 110

        int d = --a; // Pre-decrement: a becomes 108, then d = 108

        System.out.println("the value of D is " + d); // Output: 108

        System.out.println("the value of A is " + a); // Output: 108

        int l = b--; // Post-decrement: l = 110, then b becomes 109

        System.out.println("the value of l is " + l); // Output: 110

        System.out.println("the value of b is " + b); // Output: 109

        int s = d-- + --b;
        // d--: use d = 108, then d = 107
        // --b: b becomes 108
        // s = 108 + 108 = 216

        System.out.println("the value of S is " + s); // Output: 216

        s = --d + --b;
        // --d: d becomes 106
        // --b: b becomes 107
        // s = 106 + 107 = 213
    }
}