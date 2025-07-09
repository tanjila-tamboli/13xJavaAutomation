package Task_8_july;

public class Task5_Compare_Wrapper_objects_using_equalSign_equals {
    public static void main(String[] args) {
        // Values between -128 and 127 are cached in Integer pool
        Integer a = 100;
        Integer b = 100;

        // Values outside of -128 to 127 are not cached
        Integer c = 200;
        Integer d = 200;

        System.out.println("a==b:" + (a == b));
        System.out.println("c==d: " + (c == d));

        System.out.println("a.equals(b): " + a.equals(b));  // true (compares values)
        System.out.println("c.equals(d): " + c.equals(d));  // true (compares values)
    }
}