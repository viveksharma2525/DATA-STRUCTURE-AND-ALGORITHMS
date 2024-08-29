/*
 */
import java.util.LinkedList;
public class LL1 {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
       list.add(100);
       list.add(5);
       list.add(2);
       list.add(200);

       System.out.println(list.getFirst());
       System.out.println(list.getLast());

       // pollFirst() is the remove the first element from the Linked List
       list.pollFirst();
       System.out.println(list.getFirst());

       list.pollLast();
       System.out.println(list.getLast());
       list.add(1,-45);
       System.out.println(list);
    }
}
