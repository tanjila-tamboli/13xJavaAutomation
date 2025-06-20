package Ex_06_ForLoop;

public class Lab_114_loop_continue_even_odd {
    public static void main(String[] args) {
        for(int i=0; i<50;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println("odd=" +i);
        }
    }
}
