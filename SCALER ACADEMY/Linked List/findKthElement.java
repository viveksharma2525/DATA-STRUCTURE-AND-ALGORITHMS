/**
 * findKthElement
 */
public class findKthElement {

    // Node class definition
    static class Node {
        int data;
        Node next;

         Node(int x) {
            data = x;
            next = null;
        }
    }

    // LinkedList class definition
    static class LinkedList {
        Node head;

        public int findKthElement(int k) {
            Node temp = head;
            
            while (temp != null && k > 0) {
                temp = temp.next;
                k--;
            }
            
            if (temp != null) {
                return temp.data;
            }
            
            return -1;
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
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Main class definition
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(3);
        list.append(1);
        list.append(2);
        list.append(5);
        list.append(13);
        list.append(6);
        list.append(9);
        
        System.out.println("Linked List:");
        list.printList();
        
        int k = 4;
        int result = list.findKthElement(k);
        if (result != -1) {
            System.out.println("The " + k + "th element is: " + result);
        } else {
            System.out.println("Invalid value of k.");
        }
    }
}
