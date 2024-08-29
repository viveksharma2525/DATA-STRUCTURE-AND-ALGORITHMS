/*
 Given: Len(h1) >= len(h2);
 */
public class MergeTwoLL {
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
        //Node h1;  // head of Linked List 1
        //Node h2;  // head of Linked list 2
        Node temp;
        public Node Merge(Node h1, Node h2){
            Node current =  h1;
            while (h2!=null) {
                temp = h2;
                h2 = h2.next;
                temp.next = current.next;
                current.next = temp;
                current = temp.next;
            }
            return h1;
        }
        public void append(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                return;
            }
            Node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        public void PrintList(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MergeTwoLL merging = new MergeTwoLL();
        LinkedList list1 = merging.new LinkedList();
        LinkedList list2 = merging.new LinkedList();

        list1.append(3);
        list1.append(1);
        list1.append(5);
        list1.append(7);
        list1.append(6);

        System.out.println("The Linked List1 is : ");
        list1.PrintList();

        list2.append(9);
        list2.append(8);
        list2.append(2);
        list2.append(4);

        System.out.println("The Linked List2 is:");
        list2.PrintList();

        System.out.println("After Merging Two Linked list:");
        list1.head = merging.new LinkedList().Merge(list1.head, list2.head);
        list1.PrintList();

    }
}
