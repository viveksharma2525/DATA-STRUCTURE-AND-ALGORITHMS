/**
 Q:Check if there is a loop inside the given LL or not.
 */
public class RemoveLoop {
    class  node{
        int data;
        node next;
        node(int x){
            this.data = x;
            this.next = null;
        }
    }
    class LinkedList{
        node head;

        public void removing(){
            node start = detect();
            node temp = start;
            while (temp!=start) {
                temp = temp.next;               
            }
            temp.next = null; 
        }
        

        // To check the cycle
        public node detect(){
            // nullpoint exception handler
            if (head == null && head.next == null) {
                return null;
            }

            node slow = head;
            node fast = head;

            while (fast.next!=null && fast.next.next!=null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return slow;
                }
            }
            return null;
        }

        // function to create a cycle
        public void createcycle(int position){
            if (position == -1) {
                return;
            }
            int index= 0;
            node temp = head;
            node cyclestart = null;
            while (temp.next!=null) {
                if (index == position) {
                    cyclestart = temp;
                }
                temp = temp.next;
                index++;
            }
            temp.next  = cyclestart;
        }
        public void append(int data){
            node newnode = new node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        public void printList(){
            node temp = head;
            while (temp!=null) {
                System.out.print(temp.data  + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RemoveLoop initialPoint = new RemoveLoop();
        LinkedList list = initialPoint.new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);

        //create a cycle in the Linked List
        list.createcycle(3);
        
        System.out.println("List after removing the loop:");
        list.removing();
        list.printList();
    }
}
