package Ex_29_Wrapper_class;

public class Lab_214_Wrapper_conversion {
    public static void main(String[] args) {

        String num = "10";

        // 🔸 String to Wrapper Object (Boxing)
        Integer a = Integer.parseInt(num);     // Returns primitive int
        Integer b = Integer.valueOf(num);      // Returns Integer object

        // 🔸 String to Primitive
        int aa = Integer.parseInt(num);        // "10" → 10

        // 🔸 Wrapper to String
        System.out.println(a.toString());      // Output: "10"

        // 🔸 Primitive to String via Wrapper
        int age = 10;
        Integer age_wrapper = age;             // Autoboxing
        System.out.println(age_wrapper.toString());  // Output: "10"

        // 🔸 Primitive to String (Alternative)
        String ageStr = String.valueOf(age);   // Output: "10"
        System.out.println(ageStr); // "10"
    }
}
