import java.util.Stack;

public class Sort_Stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);

        System.out.println("Original Stack: " + s);
        sort(s);
        System.out.println("Sorted Stack: " + s);
    }

    public static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        sort(stack);
        insertInSortedOrder(stack, top);
    }

    public static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() < element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertInSortedOrder(stack, element);
        stack.push(top);
    }
}
