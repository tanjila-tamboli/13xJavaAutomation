package Ex_16_Arrays;

public class Lab_aaray_copy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);

    }
}
