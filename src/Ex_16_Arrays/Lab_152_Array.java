package Ex_16_Arrays;

import java.util.Arrays;

public class Lab_152_Array {
    public static void main(String arg[]) {
        int[] a = {1, 25, 17, 8, 9, 10, 15};
        // System.out.println(a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
