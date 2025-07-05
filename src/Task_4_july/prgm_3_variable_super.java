package Task_4_july;

public class prgm_3_variable_super {
    public static void main(String[] args)
    {
        Car obj= new Car();
        obj.displayNames();
        System.out.println( obj.name);
    }
}

class Vehicle
{
    String name = "BMW";
}

class Car extends Vehicle
{
    String name = "Alto";

    void displayNames() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name: " + super.name);
    }
}

