/* 
 Insertion done in such that LL remains sorted List
  
 pseudo code:
  Node x = new node(K);
  if(head == null){
    head = x;
  }

  //insert at head
  Node temp = head;
  if(head.data>=K){
    temp = head;
  }

  while(temp.next!=null && temp.next.data<K){
    temp = temp.next;
  }
   // Make a connection between node
  x.next = temp.next 
  temp.next = x;
 */
public class Insertion {
    class Node{
        int data;
        Node next;

        Node(int x){
            this.data = x;
            this.next = null;
        }
    }
    class LinkedList{
        Node head;
        public  int insert(int K){
            Node x = new Node(K);
            if (head == null) {
                head = x;
            }
            Node temp = head;
            //insert at head
            if (head.data >= K) {
                temp = head;
            }
            while (temp.next!=null && temp.next.data<K) {
                temp = temp.next;
            }
            x.next = temp.next;// connection between 9 and 14;
            temp.next =  x; // make connextion between 6 and 9;

            return K;
        }
        public void append(int data){
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            Node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        public void printList(){
            Node temp = head;
            while (temp!=null) {
                System.out.println(temp.data  + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Insertion insertion = new Insertion();
            Insertion.LinkedList list = insertion.new LinkedList();

            // list.append(1);
            list.append(3);
            list.append(4);
            list.append(7);
            list.append(12);
            list.append(18);
            // list.append(20);
            list.insert(14);

            System.out.println("Linked List");
            list.printList();
        }
    }
}
