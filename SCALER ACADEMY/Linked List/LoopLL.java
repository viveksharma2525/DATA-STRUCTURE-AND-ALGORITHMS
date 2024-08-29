/**
 Q:Check if there is a loop inside the given LL or not.
 */
public class LoopLL {
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

        // To check the cycle
        public boolean detect(){
            // nullpoint exception handler
            if (head == null && head.next == null) {
                return false;
            }

            node slow = head;
            node fast = head;

            while (fast.next!=null && fast.next.next!=null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true;
                }
            }
            return false;
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
        LoopLL detect = new LoopLL();
        LinkedList list = detect.new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);

        System.out.println("The LinkedList is:");
        list.createcycle(3);
    
        System.out.println("Is there is loop inside the LinkedList?");        
        System.out.println(list.detect());
    }
}
