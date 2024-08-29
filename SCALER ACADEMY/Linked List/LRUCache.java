/*  Asked in twitch
 * Storage
 * 
 * Register ->
 * cache -> Temporary Storage
 * RAM ->
 * Secondary Storage ->
 */
import java.util.HashMap;
public class LRUCache {
    class node{
        int data;
        node next;
        node prev;
        node(int x){
            this.data = x;
        }
    }

    // data initalization
    HashMap<Integer,node> hash = new HashMap<>();
    node head;
    node tail;
    int size;
    int capacity;

    LRUCache(int cap){
        head = new node(-1); // dummy head
        tail = new node (-1); // dummy tail

        head.next = tail;
        tail.prev = head;

        size = 0;
        capacity = cap;
        this.hash =  new HashMap<>();  //initalize your hash map
    }

    public void addToTail(node x){
        x.next = tail;
        x.prev = tail.prev;
        tail.prev.next = x;
        tail.prev = x;
    }
    public void remove(node temp){
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void put(int data){
        if (hash.containsKey(data)) {
            node temp = hash.get(data);
            remove(temp);
            addToTail(temp);
        }
        else{
            if (size == capacity) {
                hash.remove(head.next.data);
                remove(head.next);
                size --;
            }
            node temp = new node(data);
            hash.put(data, temp);
            addToTail(temp);
            size++;
        }
    }
    public static void main(String[] args) {
        int capacity = 5;
        LRUCache cache = new LRUCache(capacity);

        cache.put(7);
        cache.put(3);
        cache.put(9);
        cache.put(2);

        // access an existing element
        cache.put(10);

        // insert a new element
        cache.put(14);

        //insert more 
        cache.put(2);
        cache.put(10);
        cache.put(15);
        cache.put(8);
        cache.put(14);

        node current = cache.head.next;
        while (current!=cache.tail) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}