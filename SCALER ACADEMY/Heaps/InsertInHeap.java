class InsertInHeap {
    public void Heapify(int heap[], int i, int size) {
        while (2 * i + 1 < size) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            int largest = i;

            if (leftChild < size && heap[leftChild] > heap[largest]) {
                largest = leftChild;
            }
            if (rightChild < size && heap[rightChild] > heap[largest]) {
                largest = rightChild;
            }

            if (largest == i) {
                return;
            }

            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            i = largest;
        }
    }
    public static int insertNode(int heap[], int key , int size){

        //Increase the size of heap 1
        size = size + 1;

        //insert the element at the end of Heap
        //Bottom up Approach
        heap[size-1] = key;

        return size;
    }
    public static void printArray(int heap[], int size){
        for(int i = 0; i<size; i++){
            System.out.print(heap[i] + " ");
        System.out.println();
        }
    }
    public static void main(String[] args) {
        InsertInHeap tree = new InsertInHeap ();

        int MAX = 1000;
        int[] heap = new int[MAX];

        //Initializing some value
        heap [0] = 7;
        heap [1] = 3;
        heap [2] = 5;
        heap [3] = 1;
        heap [4] = 6;
        heap [5] = 8;
        heap [6] = 10;
        heap [7] = 2;
        heap [8] = 13;
        heap [9] = 14;
        heap [10] = 2;
        heap [11] = 7;
        

        int size = 5;

        // element to me inserted
        int key = 9;

        size = insertNode(heap, size, key);

        printArray(heap, size);

    }
}
