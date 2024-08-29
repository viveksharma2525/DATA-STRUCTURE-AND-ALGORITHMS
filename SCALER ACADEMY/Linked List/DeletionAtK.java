public class DeletionAtK {
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
        public void  Deletion(int K){
            Node temp = head;
            if(head == null){
                head = null;
            }
            if (head.data == K) {
                head = head.next;
                temp = head;
            }
            while (temp.next!=null) {
                if (temp.next.data == K) {
                    temp.next = temp.next.next;
                    temp = head;
                }
                temp = temp.next;
            }
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
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DeletionAtK deletionAtK = new DeletionAtK();
        DeletionAtK.LinkedList list = deletionAtK.new LinkedList();
        list.append(3);
        list.append(1);
        list.append(5);
        list.append(2);
        list.append(5);
        list.append(15);
        list.append(18);

        list.Deletion(5);
        list.printList();

    }
}
