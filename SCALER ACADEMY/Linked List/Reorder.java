
public class Reorder {
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
        // reordering the Linked list
        public void reorder(){
            node m = middle(head);
            node h2 = m.next;
            m.next = null;
            h2 = reverse(h2);
            head = merge(head, h2);
        }

        // To find the reverse of the linked list
        public node reverse(node h2){
            node previous = null;
            while (h2!=null) {
                node temp = h2.next;
                h2.next = previous;
                previous = h2;
                h2 = temp;
            }
            return previous;
        }

        // To Find the middle of Linked List
        public node middle(node head){
            node slow = head;
            node fast = head;
             // base condition
             if (head == null) {
                return null;
            }

            while (fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        // To Merge the two Linked list
        public node merge(node h1 , node h2){
            node dummy = new node(0);
            node current = dummy;
            while (h1!=null && h2!=null) {
                current.next = h1;
                h1 = h1.next;
                current = current.next;
                current.next = h2;
                h2 = h2.next;
                current = current.next;
            }
            if (h1!=null) {
                current.next = h1;
            }
            if (h2 != null) {
                current.next = h2;
            }
            return dummy.next;
        }

        // To Append the List
        public void append(int data){
           node  newnode = new node(data);
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
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Reorder reorder = new Reorder();
        Reorder.LinkedList list = reorder.new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);

        System.out.println("The Linked List is:");
        list.printList();

        System.out.println("The Reorder Linked List is:");
        list.reorder();
        list.printList();
    }
}

