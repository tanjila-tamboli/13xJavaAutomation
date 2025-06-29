package Task_13_june;

public class Program5 {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a); // Output: ?

        System.out.println("b: " + b); // Output: ?
    }
}
/*Step 1: a++
Post-increment: Use first, then increase

So, value = 5

After this, a = 6

✅ Used: 5
✅ Now a = 6

🔹 Step 2: ++a
Pre-increment: Increase first, then use

a = 6 → becomes 7

✅ Used: 7*/