package Ex_20_Polymorphism.Overloading;

public class Lab188_REAL_MOverloading {
    public static void main(String[] args) {
        home h = new home();

        h.task();
        h.task(5);
        h.task(true);

    }
}
    class home
    {
        int task(int a)
        {

            System.out.println("task1");
            return a;

        }
        void task()
        {
            System.out.println("task1");
        }
        boolean task(boolean a)
        {
          return false;
        }
    }

