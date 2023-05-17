import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Insert elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack elements: " + stack);

        // Remove elements from the stack
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);

        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        System.out.println("Stack elements after removal: " + stack);
    }
}
