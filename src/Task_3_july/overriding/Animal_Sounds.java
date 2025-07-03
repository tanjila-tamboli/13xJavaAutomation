package Task_3_july.overriding;

public class Animal_Sounds {

    public static void main(String[] args) {
        Animal a = new Animal();
               a.sound();

        cat cat= new cat();
             cat.sound();

             dog dog= new dog();
             dog.sound();


              cow cow= new cow();
             cow.sound();

             Animal am= new cat();
             am.sound();

             Animal dog1= new dog();
             dog1.sound();

    }
}
    class Animal
    {
       void sound()
        {
            System.out.println("Animal sound");
        }
    }

    class cat extends Animal{
       void  sound()
       {
           System.out.println("meow");
       }
    }
    class dog extends Animal
    {
        void sound()
        {
            System.out.println("bark");
        }
    }
    class cow extends Animal
    {
        void sound()
        {
            System.out.println("mooow");
        }
    }

