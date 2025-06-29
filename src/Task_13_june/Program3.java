package Task_13_june;

public class Program3 {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(x++ + ++x);

        /*x++ — Post-increment:
Value of x is 5

So, it uses 5, then increases x to 6

✅ Used Value = 5
✅ After this, x = 6

🔹 ++x — Pre-increment:
x is now 6

Pre-increment: First increase, then use → x = 7

✅ Used Value = 7*/
    }
}
