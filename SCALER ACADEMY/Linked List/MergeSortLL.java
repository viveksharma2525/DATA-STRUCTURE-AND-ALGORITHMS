public class MergeSortLL {
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

        //Function to merge the sorted Linked list
        public node merge(node h1,node h2){

            // make a dummy node to avoid the null point exception and large code to avoid it
            node h3 = null;
            node tail = null;
            h3 = new node(-1);
            tail = h3;  //dummy node

            while (h1.data<h2.data) {
                if (h1.data<h2.data) {
                    tail.next = h1;
                    tail = tail.next;
                    h1 = h1.next;
                    tail.next = null;     // optional (write to make a code perfectly working)           
                }
                else{
                    tail.next = h2;
                    tail = tail.next;
                    h2 = h2.next;
                    tail.next = null; //optional again
                }

                if (h1!=null) {
                    tail.next = h1;
                }

                if (h2!= null) {
                    tail.next = h2;
                }
            }
            return h3.next;
        }
        public void append(int data){
            node newnode = new node(data);
            if (head == null) {
                head = newnode;
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
        MergeSortLL sort = new MergeSortLL();
        LinkedList list1 = sort.new LinkedList();
        LinkedList list2 = sort.new LinkedList();

        list1.append(2);
        list1.append(6);
        list1.append(10);
        list1.append(14);
        list1.append(19);
        list1.append(25);

       System.out.println("The first sorted LinkedList is:");
       list1.printList();

        list2.append(3);
        list2.append(5);
        list2.append(9);
        list2.append(11);
        list2.append(13);
        list2.append(18);

        System.out.println("The second sorted LinkedList is:");
        list2.printList();

        System.out.println("The head of merged Linked List is :");
        list1.head = sort.new LinkedList().merge(null, null);
        list1.printList();
    }
}
