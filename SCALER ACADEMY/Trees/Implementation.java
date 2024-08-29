class Implementation {
    class Node {
        int data;
        Node left;
        Node right;
        Node parent;

        public Node(int key) {
            data = key;
            left = null;
            right = null;
            parent = null;
        }
    }

    public static void main(String[] args) {
        Implementation impl = new Implementation();
        Node root = impl.new Node(1);

        root.left = impl.new Node(2);
        root.right = impl.new Node(3);
        root.right.left = impl.new Node(5);
    }
}
