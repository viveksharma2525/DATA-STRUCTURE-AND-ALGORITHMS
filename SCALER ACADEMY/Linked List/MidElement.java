public class MidElement {
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
        public Node MidElement(){
            //base case 
            if (head == null) {
                return null;
            }    

            //main class
            Node slow = head;
            Node fast = head;

            while (fast.next!=null && fast.next.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        public void append(int data){
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            Node temp = head;
            while (temp.next!= null) {
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
    }
    public static void main(String[] args) {
        MidElement insertion = new MidElement();
        MidElement.LinkedList list = insertion.new LinkedList();

        list.append(3);
        list.append(4);
        list.append(5);
        list.append(10);
        list.append(32);

        System.out.println("The mid Node is :");
        MidElement.Node midNode = list.MidElement();
        System.out.println(midNode.data);

        System.out.println("The Linked List is:");
        list.printList(); 
    }
}
