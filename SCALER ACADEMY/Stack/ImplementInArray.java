import java.util.ArrayList;

public class ImplementInArray {

    static class Stack {
        // ArrayList to store stack elements
        private ArrayList<Integer> list = new ArrayList<>();

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return list.isEmpty();
        }

        // Method to push an element to the stack
        public void push(int x) {
            list.add(x);
        }

        // Method to pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                return -1; // Return -1 if the stack is empty
            }
            // Remove the top element and return it
            return list.remove(list.size() - 1);
        }

        // Method to get the top element of the stack
        public int top() {
            if (isEmpty()) {
                return -1; // Return -1 if the stack is empty
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(7);
        s.push(5);
        s.push(3);
        s.push(2);

        s.pop();

        System.out.println(s.top()); // Should print the top element
    }
}
