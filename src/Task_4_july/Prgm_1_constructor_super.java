package Task_4_july;



public class Prgm_1_constructor_super {
    public static void main(String[] args) {
        child obj = new child();

    }
}


        class parent
        {
            parent()
            {
                System.out.println("Parent constuctor called");
            }
        }

        class child extends parent
        {

            child()
            {
                super(); // always call parent construtcor
                System.out.println("child constuctor called");

            }

        }




