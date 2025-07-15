package Ex_32_Collection_Framework_DSA;

import java.util.Stack;

public class Lab_252_Stack {
    public static void main(String[] args) {
     Stack stack = new Stack<>();
   stack.add("java");
        stack.add("python");
        stack.add("c++");
        stack.add("c#");

        System.out.println(stack);
        System.out.println(stack.peek()); //Returns the top element without removing
        System.out.println(stack.pop());//Removes and returns the top element
        System.out.println(stack);

    }
}
