/**
 * MyStack
 */
public class MyStack {
    private int [] array = new int[20];
    private int position = 0;
    /*
     push (int value)
     place value at top of stack
     */
    public void push(int element){
        array[position] = element;
        position++;
    }
     /*
      peek()
      top element -> value
      return top element value
      */
      public  int peek(){
        return array[position -1];
      }
      /*
       pop()
       return top element value
       remove top element
       */

       public int pop(){
        /* 
        method 1
        int value = peek();
        position --;
        return value;
        */

        if(size() == 0){
            System.out.println("stack underflow error");
            return -1;
        }

        // method 2
        return array[-- position];
       }

       /*
        size()
        return -> no. of elements
        */
        public int size(){
            return position;
        }
}