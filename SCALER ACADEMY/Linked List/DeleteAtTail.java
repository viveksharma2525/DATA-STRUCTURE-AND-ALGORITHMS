public class DeleteAtTail {
    class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    class LinkedList{
        Node head;

        // To delete element at Tail
        public void deleteHead(){
            // Return head of Linked List
            //Base Case
            if (head == null || head.next == null) {
                head = null;
            }
            Node temp = head;
            while (temp.next.next!=null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        public void append(int data){
            Node newnode  = new Node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
        public void PrintList(){
            Node temp = head;
            while (temp!=null) {
                System.out.println(temp.data  +" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            DeleteAtTail deleteAtTail = new DeleteAtTail();
            LinkedList list = deleteAtTail.new LinkedList();
            System.out.println("The Updated Linked List is:");
            list.append(1);
            list.append(3);
            list.append(5);
            list.append(6);
            list.append(2);
            list.append(9);
            list.deleteHead();
            list.PrintList();
        }
    }
}

