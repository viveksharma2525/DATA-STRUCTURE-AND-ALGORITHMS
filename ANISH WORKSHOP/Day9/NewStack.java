/*
 Stack
 */
import java.util.Stack;
public class NewStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
