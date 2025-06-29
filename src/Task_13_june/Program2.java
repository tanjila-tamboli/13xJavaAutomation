package Task_13_june;

public class Program2 {
    public static void main(String[] args) {
        int i = 1;

        i = i++ + ++i;

        System.out.println(i);
    }}
/*i++ → Post-increment:
Use i = 1

Then increment it → i = 2

✅ Value used: 1
✅ i becomes 2 (after post-increment)

🔹 ++i → Pre-increment:
i = 2 → now do ++i → becomes 3
✅ Value used: 3*/



