package Task_3_july.overriding;

public class Employee_role_info {
    public static void main(String[] args) {
     employee emp= new employee();
     emp.role();

     employee emp1= new manager();
     emp1.role();

     employee emp2= new clerk();
     emp2.role();

     employee emp3= new Tester();
      emp3.role();
    }
}
class employee
{
     void role()
     {
         System.out.println("General Employee");
     }
}
class manager extends employee
{
    void role()
    {
        System.out.println("manager");
    }

}
class clerk extends employee
{
    void role()
    {
        System.out.println("clerk");
    }
}
class  Tester extends employee
{
    void role()
    {
        System.out.println("Tester");
    }
}
