/* 
public class InsertAtTail {
    class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
        class LinkedList {
        Node head;
        public void InsertTail(int K){
            Node newNode = new Node(K);
            Node temp =  head;
            if (head == null) {
                head = newNode;
                return ;  
            }
            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next =  newNode;
        }
        public void append(int data){
            Node newnNode = new Node(data);
            if (head == null) {
                head = newnNode;
                return;
            }
            Node current = head;
            while (current.next!=null) {
                current = current.next;
            }
            current.next = newnNode;
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

        list.InsertTail(2);
        list.InsertTail(133);
    }
}
}
*/
public class InsertAtTail {
    class Node {
        int data;
        Node next;
        
        Node(int x) {
            data = x;
            next = null;
        }
    }

    class LinkedList {
        Node head;

        public void InsertTail(int x) {
            Node newNode = new Node(x);
            Node temp = head;
            if (head == null) {
                head = newNode;
                return;
            }
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InsertAtTail insertAtTail = new InsertAtTail();
        LinkedList list = insertAtTail.new LinkedList();
        list.append(3);
        list.append(1);
        list.append(2);
        list.append(5);
        list.append(13);
        list.append(6);
        list.append(9);

        list.InsertTail(2);
        list.InsertTail(133);

        list.printList();
    }
}
