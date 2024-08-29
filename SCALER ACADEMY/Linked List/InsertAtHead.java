public class InsertAtHead {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }

    static class LinkedList{
        Node head;

        // Function to add node at head of Linked List
        public void atHead(int K){
            Node x = new Node(K);
            x.next =  head;
            head = x;
        }
        public void append(int data){
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            Node current = head;
            while (current.next!=null) {
                current = current.next;
            }
            current.next = newnode;
        }
        public void printList(){
            Node current = head;
            while (current!=null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(3);
        list.append(1);
        list.append(2);
        list.append(5);
        list.append(13);
        list.append(6);
        list.append(9);

        list.atHead(4);
        list.atHead(99);
        list.atHead(133);

        
        System.out.println("Linked List");
        list.printList();
        System.out.println(list);
    }
}
