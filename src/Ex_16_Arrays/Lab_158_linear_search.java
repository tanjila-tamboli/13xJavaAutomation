package Ex_16_Arrays;

public class Lab_158_linear_search {
    public static void main(String args[])
    {
        int[] a= {25,26,27,28,29};
        //Find the target 67, give index ?
         int target= 28;
         for(int i=0; i<a.length; i++)
         {
             if(target==a[i])
             {
                 System.out.println(a[i]);
                 System.out.println(i);
             }
         }
    }
}
