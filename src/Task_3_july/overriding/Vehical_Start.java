package Task_3_july.overriding;

public class Vehical_Start {
    public static void main(String[] args) {
        vehical veh= new vehical();
        veh.start();

        vehical v1= new bike();
        v1.start();
        vehical v2= new car();
        v2.start();

    }
}
class vehical
{
   void  start()
   {
       System.out.println("start vehicle");
   }
}
class bike extends vehical
{
    void start()
    {
        System.out.println("Kick start the bike");
    }
}
class car extends vehical{
    void start()
    {
        System.out.println("Turn the key to start the car");
    }
}
