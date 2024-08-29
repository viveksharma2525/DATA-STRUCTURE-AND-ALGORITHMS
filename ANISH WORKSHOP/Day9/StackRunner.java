public class StackRunner {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // initially stack is empty
        stack.push(9);
        stack.push(11);
        stack.push(-45);

        System.out.println(stack.size());

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.size());
        
        System.out.println(stack.pop());

        System.out.println(stack.size());
        
        System.out.println(stack.pop());

        System.out.println(stack.pop());

        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        stack.push(100);
    }
}
