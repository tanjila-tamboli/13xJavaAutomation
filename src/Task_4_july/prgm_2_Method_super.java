package Task_4_july;

public class prgm_2_Method_super {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayMessage();


    }

}
    class Parent {
        void displayMessage() {
            System.out.println("This is a message from the Parent class.");
        }
    }

    class Child extends Parent {
        void displayMessage() {
            super.displayMessage();
            System.out.println("This is a message from the Child class.");
        }
    }





