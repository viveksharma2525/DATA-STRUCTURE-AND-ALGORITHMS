class ExtractMin {
    int[] heap;
    int capacity;
    int size;

    public ExtractMin(int n) {
        capacity = n;
        heap = new int[capacity];
        size = 0;
    }

    public void swap(int[] heap, int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    private void MinHeapify(int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int smallest = i;

        if (leftChild < size && heap[leftChild] < heap[smallest]) {
            smallest = leftChild;
        }
        if (rightChild < size && heap[rightChild] < heap[smallest]) {
            smallest = rightChild;
        }

        if (smallest != i) {
            swap(heap, i, smallest);
            MinHeapify(smallest);
        }
    }

    public int extractMin() {
        if (size <= 0) {
            return Integer.MAX_VALUE;
        }

        if (size == 1) {
            size--;
            return heap[0];
        }

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        MinHeapify(0);

        return root;
    }

    public void insertNode(int key) {
        if (size == capacity) {
            System.out.println("Heap overflow");
            return;
        }

        size++;
        int i = size - 1;
        heap[i] = key;

        while (i != 0 && heap[(i - 1) / 2] > heap[i]) {
            swap(heap, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ExtractMin h = new ExtractMin(11);

        h.insertNode(3);
        h.insertNode(4);
        h.insertNode(5);
        h.insertNode(11);
        h.insertNode(6);
        h.insertNode(7);
        h.insertNode(8);
        h.insertNode(20);
        h.insertNode(12);

        h.printArray();

        System.out.println("Extracted min: " + h.extractMin());
        h.printArray();
    }
}
