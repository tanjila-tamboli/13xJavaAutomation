package Ex_16_Arrays;

import java.util.Arrays;

public class Lab_157_second_high_num {
    public static void main(String args[])
    {
        int[] num={1,2,3,4,5,6};
        Arrays.sort(num);
       // System.out.println(num);
        System.out.println(num[num.length-1]);
        System.out.println(num[num.length-2]);
        System.out.println(num[num.length-3]);
    }
}
