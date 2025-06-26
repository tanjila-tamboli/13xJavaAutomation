package Ex_16_Arrays;

public class Lab_156_sum_of_aaray {
    public static void main(String args[])
    {
        int[] a= {21,22,20};
        int sum =0;
        for(int i=0; i<a.length; i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
