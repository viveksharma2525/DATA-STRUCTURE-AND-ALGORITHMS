
import java.util.*;
public class TwoStackProblem {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> min_stack = new Stack<>();
    private  int current_min ;

    public TwoStackProblem(){
        s1 = new Stack<>();
        min_stack = new Stack<>();
        current_min = Integer.MAX_VALUE;
     }

    public void push(int x){
            s1.push(x);
            current_min = Math.min(current_min, x);
            min_stack.push(current_min);
    }

    public void top(){
        if (s1.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        } 
        int t = s1.peek();
        if (t<current_min) {
            System.out.println(current_min);
        }
        else{
            System.out.println(t);
        }

    }

    public int getMin(){
        if (min_stack.empty()) {
            System.out.println("Stack is empty");
        }
        return min_stack.peek();
    }


    public static void main(String[] args) {
        TwoStackProblem twoStack = new TwoStackProblem();
        twoStack.push(7);
        twoStack.push(5);
        twoStack.push(8);
        twoStack.push(2);
        // twoStack.top();
        System.out.println(twoStack.getMin());

        twoStack.push(1);


        System.out.println(twoStack.getMin());
    }

}

