package Day04;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        stack.add(5);

        isPresent(stack,10);
        isPresent(stack,20);

        System.out.println(stack.isEmpty());
    }

    public static void isPresent(Stack<Integer> stack, int item){
        if( stack.search(item) < 0)
            System.out.println("Item " + item + " is not present in stack");
        else
            System.out.println("Item " + item + " is present at index " + stack.search(item));
    }
}
