package Task_4_july;

public class prgm_6_protected_access_modifier {
    public static void main(String[] args) {
        Dog obj= new Dog();
        obj.doEat();
        obj.eat();
    }
}
class Animal
{
    protected void eat()
    {
        System.out.println("Animal are eating");
    }
}
class Dog extends Animal
{
    void doEat()
    {
        eat();// allowed because eat() is protected and Dog is a subclass
     super.eat(); // also use
    }
}
