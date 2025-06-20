package Ex_06_ForLoop;

public class Lab_112_loop_break {
    public static void main(String[] args) {
        {
            for(int i=1 ; i<50; i++)
            {
                if(i==5)
                {
                   // System.out.println(i);
                    break;
                }
                else
                {
                    System.out.println(i);
                }
            }
        }
    }
}
