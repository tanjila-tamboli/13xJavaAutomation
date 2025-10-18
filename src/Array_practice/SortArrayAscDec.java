package Array_practice;

public class SortArrayAscDec {

    public static void main(String[] args) {
        int a[] = {1, 2, 8, 7, 9, 41, 65, 24};

        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
           if( a[i]> a[j])
           {
               int temp= a[i];
               a[i]= a[j];
               a[j]= temp;
           }
            }
        }
        System.out.print("Ascending order: ");
        for (int num : a)
        {
            System.out.print(num + " ");
        }

        for(int i=0 ; i<=a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]<a[j])
                {
                    int temp= a[i];
                    a[i]= a[j];
                    a[j]= temp;
                }
            }
        }
        System.out.println();
        System.out.print("Decending: ");
        for(int num: a)
        {
            System.out.print(num + " ");
        }

    }
}