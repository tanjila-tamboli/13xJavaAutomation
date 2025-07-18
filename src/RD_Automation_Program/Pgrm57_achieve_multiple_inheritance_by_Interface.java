package RD_Automation_Program;

public class Pgrm57_achieve_multiple_inheritance_by_Interface {
    public static void main(String[] args) {
        Bat B= new Bat();
        B.eat();
        B.fly();

    }
}
interface Bird
{
    void fly();
}
interface Animals
{
    void eat();
}

class Bat implements Animals, Bird
{
    public void fly()
    {
        System.out.println("Bat fly like birds");
    }

    public void eat()
    {
        System.out.println("Bat eat insects");
    }
}
