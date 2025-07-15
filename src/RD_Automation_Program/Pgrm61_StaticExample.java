package RD_Automation_Program;

public class Pgrm61_StaticExample {

    static int count=0;
    Pgrm61_StaticExample()
    {
        count++; //Increment count each time an object is created
    }

    public static void main(String[] args) {

        Pgrm61_StaticExample obj1= new Pgrm61_StaticExample();
        Pgrm61_StaticExample obj2= new Pgrm61_StaticExample();
        Pgrm61_StaticExample obj3= new Pgrm61_StaticExample();
        System.out.println(count);


    }
}
