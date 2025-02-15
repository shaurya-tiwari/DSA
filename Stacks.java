import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        System.out.println("Top element: " + stack.peek()); // top element after using the peel method 
    }
}