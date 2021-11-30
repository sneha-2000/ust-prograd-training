import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<Integer>();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.pop();
        stack.addAll(stack);
        System.out.println(stack.indexOf(4));
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
