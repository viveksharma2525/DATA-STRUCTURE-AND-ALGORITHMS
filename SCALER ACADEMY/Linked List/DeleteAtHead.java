public class DeleteAtHead {
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

        // To delete element at head
        public void deleteHead(){
            if(head!=null){
                head = head.next;
            }
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
            DeleteAtHead deleteAtHead = new DeleteAtHead();
            LinkedList list = deleteAtHead.new LinkedList();
            list.append(1);
            list.append(3);
            list.deleteHead();
            list.PrintList();
        }
    }
}
