package Task_11_july;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5_Compare_ArrayList_vs_LinkedList_Performance {
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>();
      long start_time= System.currentTimeMillis();

        for(int i=0; i<100000; i++)
        {
            a1.add(i);
        }
        long end_time= System.currentTimeMillis();
        long duration=end_time-start_time;

           //LinedList
        List<Integer> l2= new LinkedList<>();
        long start_time1= System.currentTimeMillis();

        for(int i=0; i<100000; i++)
        {
            l2.add(i);
        }
        long end_time1= System.currentTimeMillis();
        long duration1=end_time1-start_time1;

        System.out.println("ArrayList "+duration);
        System.out.println("LinkedList" +duration1);
    }
}
