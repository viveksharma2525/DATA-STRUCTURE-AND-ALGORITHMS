/**
  MergeSort
 */
public class MergeSort {
    class node{
        int data;
        node next;
        node(int x){
            this.data = x;
            this.next = null;
        }
    }
    class LinkedList{
        node head;

        public node mergesort(node head){
            //base case
            if (head == null || head.next == null) {
                return head;
            }

            node m = middle(head);
            node head2 = m.next;
            m.next = null;

            //recurisive function
            head = mergesort(head);
            head2 = mergesort(head2);

            return merge(head, head2);

        }

        public node middle(node head){
            if (head == null ) {
                return null;
            }
            node slow = head;
            node fast = head;

            while (fast.next !=null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        // function to merge two linked list
        public node merge(node left , node right ){
            // function to merge the linked list
            node dummy = new node(0);
            node current = dummy;

            while (left!=null && right!=null) {
                if (left.data<right.data) {
                    current.next = left;
                    left = left.next;
                }
                else{
                    current.next = right;
                    right = right.next;
                }
                current = current.next;
            }

            if (left!=null) {
                current.next = left;
            }

            if (right!=null) {
                current.next = right;
            }
            return dummy.next;
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
        public void PrintList(){
            node temp = head;
            while (temp!=null) {
                System.out.print(temp.data  + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        LinkedList list = sort.new LinkedList();

        list.append(2);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(1);
        list.append(8);
        list.append(3);
        list.append(4);

        System.out.println("The Unsort Linked List is:");
        list.PrintList();

        System.out.println("The Sorted Linked List is:");
        list.head= sort.new LinkedList().mergesort(list.head);
        list.PrintList();
    }
}